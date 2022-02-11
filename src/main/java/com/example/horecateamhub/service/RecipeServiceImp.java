package com.example.horecateamhub.service;

import com.example.horecateamhub.model.Recipe;
import com.example.horecateamhub.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecipeServiceImp implements RecipeService {

    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeServiceImp (RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void save(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    @Override
    public List<Recipe> findByOrderByNameAsc() {
        return recipeRepository.findByOrderByNameAsc();}

    @Override
    public List<Recipe> findAllByType(String type) {
        return recipeRepository.findAllByType(type);}

    @Override
    public List<Recipe> findAllByGlutenIsFalseOrderByNameAsc() {
        return recipeRepository.findAllByGlutenIsFalseOrderByNameAsc();
    }

    @Override
    public List<Recipe> findAllByLactoseIsFalseOrderByNameAsc() {
        return recipeRepository.findAllByLactoseIsFalseOrderByNameAsc();
    }

    @Override
    public List<Recipe> findAllByNutsIsFalseOrderByNameAsc() {
        return recipeRepository.findAllByNutsIsFalseOrderByNameAsc();
    }

}
