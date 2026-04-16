package com.xworkz.task10;

import java.util.Arrays;

public class GoldChain extends Chain{
    String brand;
    int carat;

    public GoldChain(String[] brands, ChainType type, double price, int length, Seller seller, String brand, int carat) {
        super(brands, type, price, length, seller);
        this.brand = brand;
        this.carat = carat;
    }
    @Override
    void info(){
        super.info();
        System.out.println("This is a gold chain with brand: " + brand + " and carat: " + carat);
    }

    @Override
    void wear() {
        super.wear();
    }

    @Override
    public String toString() {
        return "GoldChain{" + "brand='" + brand + '\'' + ", carat=" + carat + ", brands=" + Arrays.toString(brands) +
                ", type=" + type + ", price=" + price + ", length=" + length + ", seller=" + seller + '}';
    }
}
