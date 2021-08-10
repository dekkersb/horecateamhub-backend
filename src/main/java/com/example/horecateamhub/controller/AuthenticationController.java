package com.example.horecateamhub.controller;

import com.example.horecateamhub.model.User;
import com.example.horecateamhub.payload.AuthenticationRequest;
import com.example.horecateamhub.payload.AuthenticationResponse;
import com.example.horecateamhub.repository.UserRepository;
import com.example.horecateamhub.service.CustomUserDetailsService;
import com.example.horecateamhub.service.UserServiceImpl;
import com.example.horecateamhub.utils.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api/v1")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    JwtUtil jwtUtl;

    @GetMapping(value = "/authenticated")
    public ResponseEntity<Object> authenticated(Authentication authentication, Principal principal) {
        return ResponseEntity.ok().body(principal);
    }

    @PostMapping(value = "/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {

        String username = authenticationRequest.getUsername();
        String password = authenticationRequest.getPassword();
        User user = userRepository.getById(username);
        String authority = user.getAuthority();
        AuthenticationResponse authenticationResponse = new AuthenticationResponse();
        authenticationResponse.setAuthorityRole(authority);
        authenticationResponse.setUsername(username);

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password)
            );
        }
        catch (BadCredentialsException ex) {
            throw new Exception("Incorrect username or password", ex);
        }

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(username);

        final String jwt = jwtUtl.generateToken(userDetails);

        authenticationResponse.setJwt(jwt);

        return ResponseEntity.ok(new AuthenticationResponse(jwt, username, authority));
    }

}
