package com.xworkz.krmarket.MobileShop;

public class Company implements Mobile {

    @Override
    public void manufacture() {
        System.out.println("Manufacturing mobile phones...");
    }

    @Override
    public void sell() {
        System.out.println("Selling mobile phones...");
    }
}
