package com.example.horecateamhub.repository;

import com.example.horecateamhub.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
 List<Recipe> findByOrderByNameAsc();
 List<Recipe> findAllByType(String type);
 List<Recipe> findAllByGlutenIsFalseOrderByNameAsc();
 List<Recipe> findAllByLactoseIsFalseOrderByNameAsc();
 List<Recipe> findAllByNutsIsFalseOrderByNameAsc();
}
