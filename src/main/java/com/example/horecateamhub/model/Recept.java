package com.example.horecateamhub.model;

import javax.persistence.*;

@Entity
@Table
public class Recept {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String type;

    private String quantity;

    private String steps;

    private boolean gluten;

    private boolean lactose;

    private boolean noten;

    public Recept () {

    }

    public Recept (String name, String type, String quantity, String steps, boolean gluten, boolean lactose, boolean noten){
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.steps = steps;
        this.gluten = gluten;
        this.lactose = lactose;
        this.noten = noten;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public boolean getGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public boolean getLactose() {
        return lactose;
    }

    public void setLactose(boolean lactose) {
        this.lactose = lactose;
    }

    public boolean getNoten() {
        return noten;
    }

    public void setNoten(boolean noten) {
        this.noten = noten;
    }

}
