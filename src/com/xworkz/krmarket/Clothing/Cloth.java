package com.xworkz.krmarket.Clothing;

public class Cloth implements ClothShop {
    @Override
    public void sellCloth() {
        System.out.println("Selling cloth");
    }

    @Override
    public void closeShop() {
        System.out.println("Cloth shop is closed");
    }
}
