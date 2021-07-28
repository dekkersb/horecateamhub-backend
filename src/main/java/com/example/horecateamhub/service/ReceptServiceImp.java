package com.example.horecateamhub.service;

import com.example.horecateamhub.model.Recept;
import com.example.horecateamhub.repository.ReceptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceptServiceImp implements ReceptService {

    private ReceptRepository receptRepository;

    @Autowired
    public ReceptServiceImp (ReceptRepository receptRepository) {
        this.receptRepository = receptRepository;
    }

    @Override
    public List<Recept> findAll() { return receptRepository.findAll(); }

    @Override
    public Recept save(Recept recept) {
        return  receptRepository.save(recept);
    }
}
