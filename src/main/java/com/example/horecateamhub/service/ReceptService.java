package com.example.horecateamhub.service;

import com.example.horecateamhub.model.Recept;

import java.util.List;

public interface ReceptService {
    Recept save(Recept recept);
    List<Recept> findByOrderByNameAsc();
    List<Recept> findAllByType(String type);
    List<Recept> findAllByGlutenIsFalseOrderByNameAsc();
    List<Recept> findAllByLactoseIsFalseOrderByNameAsc();
    List<Recept> findAllByNotenIsFalseOrderByNameAsc();

}
