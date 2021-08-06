//package com.example.horecateamhub.model;
//
//import com.fasterxml.jackson.annotation.JsonProperty;
//import javax.persistence.*;
//
//@Entity
//public class Ingredient {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    private String IngredientName;
//
//    @ManyToOne
//    @JoinColumn(name = "recept_id", nullable = true)
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private Recept recept;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getIngredientName() {
//        return IngredientName;
//    }
//
//    public void setIngredientName(String ingredientName) {
//        IngredientName = ingredientName;
//    }
//
//    public Recept getRecept() {
//        return recept;
//    }
//
//    public void setRecept(Recept recept) {
//        this.recept = recept;
//    }
//}