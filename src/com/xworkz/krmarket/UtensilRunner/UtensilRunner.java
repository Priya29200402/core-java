package com.xworkz.krmarket.UtensilRunner;

import com.xworkz.krmarket.Utensil.Customer;

public class UtensilRunner {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.sellUtensil();
        customer.buyUtensil();
        customer.displayUtensilDetails();
    }
}
