package com.example.horecateamhub.service;

import com.example.horecateamhub.model.Recept;

import java.util.List;

public interface ReceptService {
    List<Recept> findAllByGlutenIsFalseOrderByNameAsc();
    Recept save(Recept recept);
    List<Recept> findByOrderByNameAsc();

    List<Recept> findAllByType(String type);

}
