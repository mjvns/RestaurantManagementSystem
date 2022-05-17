import com.rms.inventorymanagement.Inventory;

import java.util.Scanner;

public class RMS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Restaurant Management System...");
        System.out.println("Press 1 ---> View Available Ingredients");
        System.out.println("Press 2 ---> Order Specific Ingredients");
        System.out.println("Press 3 ---> View Total Sales");

        byte userInput = scan.nextByte();

        switch(userInput){
            case 1:
                Inventory.listAvailableIngredients();
        }
    }
}