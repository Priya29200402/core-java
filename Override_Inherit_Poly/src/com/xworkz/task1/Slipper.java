package com.xworkz.task1;

enum Brand{
    NIKE, ADIDAS, PUMA, REEBOK
}
public class Slipper{

    Brand brand;
    String color;
    int[] sizes;
    double price;
    Category category;

    public Slipper(Brand brand, String color, int[] sizes, double price, Category category) {
        this.brand = brand;
        this.color = color;
        this.sizes = sizes;
        this.price = price;
        this.category = category;
    }

    void info(){
        System.out.println("Getting info about the slipper:");
    }
    void wear(){
        System.out.println("Wearing the slipper");
    }
    public String toString() {
        return "Slipper{" + "brand=" + brand + ",color='" + color + '\'' + ", sizes=" + java.util.Arrays.toString(sizes) +
                ", price=" + price + ", category=" + category.name + '}';
    }
}
