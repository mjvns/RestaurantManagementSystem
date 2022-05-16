package com.rms.inventorymanagement;

import com.rms.entities.IngredientQuantity;

import java.util.List;

public class Inventory {
    private List<IngredientQuantity> stock;

    public List<IngredientQuantity> getStock() {
        return stock;
    }
}