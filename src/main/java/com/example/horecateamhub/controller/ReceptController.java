package com.example.horecateamhub.controller;

import com.example.horecateamhub.model.Recept;
import com.example.horecateamhub.service.ReceptServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"*"} )
@RestController
@RequestMapping("/recept")
public class ReceptController {

    @Autowired
    ReceptServiceImp receptServiceImp;


    @PostMapping
    public ResponseEntity<Object> saveRecept(@RequestBody Recept recept) {
        receptServiceImp.saveRecept(recept);
        return ResponseEntity.ok ("added");
    }


}
