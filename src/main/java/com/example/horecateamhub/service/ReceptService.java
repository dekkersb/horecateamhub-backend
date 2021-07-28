package com.example.horecateamhub.service;

import com.example.horecateamhub.model.Recept;

import java.util.List;

public interface ReceptService {
    List<Recept> findAll ();
    Recept save(Recept recept);
}
