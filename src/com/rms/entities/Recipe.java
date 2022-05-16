package com.rms.entities;

import java.util.List;

public class Recipe {
    private String name;
    private List<IngredientQuantity> composition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IngredientQuantity> getComposition() {
        return composition;
    }

    public void setComposition(List<IngredientQuantity> composition) {
        this.composition = composition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;
}