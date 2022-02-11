package com.example.horecateamhub.service;

import com.example.horecateamhub.model.Recipe;

import java.util.List;

public interface RecipeService {
    void save(Recipe recipe);
    List<Recipe> findByOrderByNameAsc();
    List<Recipe> findAllByType(String type);
    List<Recipe> findAllByGlutenIsFalseOrderByNameAsc();
    List<Recipe> findAllByLactoseIsFalseOrderByNameAsc();
    List<Recipe> findAllByNutsIsFalseOrderByNameAsc();

}
