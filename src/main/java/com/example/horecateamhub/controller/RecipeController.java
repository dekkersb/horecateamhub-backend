package com.example.horecateamhub.controller;

import com.example.horecateamhub.model.Recipe;
import com.example.horecateamhub.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"} )
@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

private RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public List<Recipe> findByOrderByNameAsc() {
        return recipeService.findByOrderByNameAsc();}

    @GetMapping("/types")
    public List<Recipe> findAllByType(@RequestParam String type) {
        return recipeService.findAllByType(type);}

    @GetMapping("/glutenfree")
    public List<Recipe> findAllByGlutenIsFalseOrderByNameAsc() {
        return recipeService.findAllByGlutenIsFalseOrderByNameAsc(); }

    @GetMapping("/lactosefree")
    public List<Recipe> findAllByLactoseIsFalseOrderByNameAsc() {
        return recipeService.findAllByLactoseIsFalseOrderByNameAsc(); }

    @GetMapping("/nutsfree")
    public List<Recipe> findAllByNutsIsFalseOrderByNameAsc() {
        return recipeService.findAllByNutsIsFalseOrderByNameAsc(); }

    @PostMapping("/new_recipe")
    public ResponseEntity<Object> saveRecipe(@RequestParam String name,
                                            @RequestParam String type,
                                            @RequestParam String quantity,
                                            @RequestParam String ingredients,
                                            @RequestParam String steps,
                                            @RequestParam(defaultValue = "false") boolean gluten,
                                            @RequestParam(defaultValue = "false") boolean lactose,
                                            @RequestParam(defaultValue = "false") boolean nuts)
        { try {
            Recipe recipe = new Recipe();
            recipe.setName(name);
            recipe.setType(type);
            recipe.setQuantity(quantity);
            recipe.setIngredients(ingredients);
            recipe.setSteps(steps);
            recipe.setGluten(gluten);
            recipe.setLactose(lactose);
            recipe.setNuts(nuts);

            recipeService.save(recipe);
            return ResponseEntity.noContent().build();
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
