package com.xworkz.task10;

import java.util.Arrays;

enum ChainType {
    GOLD, SILVER, PLATINUM, DIAMOND
}
public class Chain {
    String[] brands;
    ChainType type;
    double price;
    int length;
    Seller seller;


    public Chain(String[] brands, ChainType type, double price , int length, Seller seller) {
        this.brands = brands;
        this.type = type;
        this.price = price;
        this.length = length;
        this.seller = seller;
    }
    void info(){
        System.out.println("Getting info about the chain:");
    }
    void wear(){
        System.out.println("Wearing the chain");
    }

    @Override
    public String toString() {
        return "Chain [brand=" + Arrays.toString(brands) + ", type=" + type + ", price=" + price + ", length=" + length + ", seller=" + seller + "]";
    }
}
