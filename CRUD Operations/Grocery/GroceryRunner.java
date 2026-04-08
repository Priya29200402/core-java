package com.xworkz.task4;

public class GroceryRunner {
    public static void main(String[] args) {

        Grocery[] groceries = new Grocery[3];
        GroceryStore store = new GroceryStore(groceries);

        Grocery item1 = new Grocery(21, "Milk", 56, 2, "Dairy");
        Grocery item2 = new Grocery(22, "Moong Dal", 250, 3, "Grocery");

        store.store(item1);
        store.store(item2);

        System.out.println("\nAll Groceries ");
        store.displayAll();

        System.out.println("\nSearch");
        store.getGroceryDetails(22);

        System.out.println("\nUpdate");
        store.updateItemPrice("Milk",80);


    }
}
