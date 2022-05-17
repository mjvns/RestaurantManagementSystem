package com.rms.inventorymanagement;

import com.rms.entities.IngredientQuantity;

import java.util.Iterator;
import java.util.List;

public class Inventory {
    private static List<IngredientQuantity> stock;

    private static List<IngredientQuantity> getStock() {
        return stock;
    }

    public static void listAvailableIngredients(){
        List<IngredientQuantity> availableIngredients = getStock();
        Iterator<IngredientQuantity> itr = availableIngredients.listIterator();

        while (itr.hasNext()){
            IngredientQuantity ingredientInfo = itr.next();
            System.out.println("Ingredient Name: "+ ingredientInfo.getIngredient().getName() + "\n" +
                                "Quantity in stock: "+ ingredientInfo.getQuantity());
        }
    }
}