package com.example.horecateamhub.controller;

import com.example.horecateamhub.model.Recept;
import com.example.horecateamhub.service.ReceptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"} )
@RestController
@RequestMapping("/recept")
public class ReceptController {
private ReceptService receptService;

    @Autowired
    public ReceptController(ReceptService receptService) {
        this.receptService = receptService;
    }

    @GetMapping
    public List<Recept> findAll() {
        return receptService.findAll();
    }

    @PostMapping("/new_recipe")
    public ResponseEntity<Object> saveRecept(@RequestParam String name,
                                            @RequestParam String type,
                                            @RequestParam String quantity,
                                            @RequestParam String steps,
                                            @RequestParam boolean gluten,
                                            @RequestParam boolean lactose,
                                            @RequestParam boolean noten)
        { try {
            Recept recept = new Recept();
            recept.setName(name);
            recept.setType(type);
            recept.setQuantity(quantity);
            recept.setSteps(steps);
            recept.setGluten(gluten);
            recept.setLactose(lactose);
            recept.setNoten(noten);

            receptService.save(recept);
            return ResponseEntity.noContent().build();
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
