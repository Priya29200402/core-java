package com.xworkz.krmarket.Utensil;

public interface UtensilShop {
    default void sellUtensil() {
        System.out.println("Selling utensils");
    }
    void buyUtensil();
    void displayUtensilDetails();
}
