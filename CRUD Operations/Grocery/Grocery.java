package com.xworkz.task4;

public class Grocery {
    int id;
    String itemName;
    double price;
    int quantity;
    String category;

    public Grocery(int id, String itemName, double price, int quantity, String category) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public void displayInfo() {
        System.out.println("Id :"+ this.id);
        System.out.println("ItemName:"+this.itemName);
        System.out.println("Price:"+this.price);
        System.out.println("Quantity:"+this.quantity);
        System.out.println("Category:"+this.category);
    }
}