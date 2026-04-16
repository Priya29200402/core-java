package com.xworkz.krmarket.Utensil;

public class Customer implements UtensilShop {
    @Override
    public void buyUtensil() {
        System.out.println("Customer is buying utensils");
    }

    @Override
    public void displayUtensilDetails() {
        System.out.println("Displaying utensil details for the customer");
    }
}
