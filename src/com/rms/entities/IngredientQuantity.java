package com.rms.entities;

public class IngredientQuantity {
    private Ingredient ingredient;
    private double quantity;

    public double getQuantity() {
        return quantity;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}