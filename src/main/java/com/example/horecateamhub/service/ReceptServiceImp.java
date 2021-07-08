package com.example.horecateamhub.service;

import com.example.horecateamhub.model.Recept;
import com.example.horecateamhub.repository.ReceptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceptServiceImp implements ReceptService {

    @Autowired
    ReceptRepository receptRepository;

    @Override
    public Recept saveRecept (Recept recept) {
        receptRepository.save(recept);
        return recept;
    }
}
