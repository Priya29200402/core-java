package com.xworkz.krmarket.LaptopShop;

public class ShopOwner implements LaptopShop {
    @Override
    public void sellLaptop() {
        System.out.println("Selling laptops to customers.");
    }

    @Override
    public void repairLaptop() {
        System.out.println("Repairing laptops for customers.");
    }
}
