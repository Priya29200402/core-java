package com.xworkz;

public class Toy{
    int id;
    String name;
    String brand;
    double price;
    String type;

    public Toy(int id, String name, String brand, double price, String type){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("Executing displayInfo in Toy...");
        System.out.println("Toy Id:"+this.id);
        System.out.println("Name:"+this.name);
        System.out.println("Brand:"+this.brand);
        System.out.println("Price:"+this.price);
        System.out.println("Type:"+this.type);

    }
}
