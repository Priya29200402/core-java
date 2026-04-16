package com.xworkz.task9;



import java.util.Arrays;

enum BeltType {
    LEATHER, FABRIC, SYNTHETIC
}
public class Belt {
    String[] brands;
    BeltType type;
    double price;
    int length;
    MaterialType materialType;

    public Belt(String[] brands, BeltType type, double price, int length, MaterialType materialType) {
        this.brands = brands;
        this.type = type;
        this.price = price;
        this.length = length;
        this.materialType = materialType;
    }

    void getDetails() {
        System.out.println("Belt Details:");
        System.out.println("Brand:" + Arrays.toString(brands));
        System.out.println("Type:" + type);
        System.out.println("Price:" + price);
        System.out.println("Length:" + length);
        System.out.println("Material:" + materialType);
    }
    void wear() {
        System.out.println("Wearing the belt");
    }
    void buckle() {
        System.out.println("Buckling the belt");
    }

    @Override
    public String toString() {
        return "Belt{" + "brands=" + Arrays.toString(brands) + ", type=" + type + ", price=" + price +
                ", length=" + length + ", materialType=" + materialType + '}';
    }
}
