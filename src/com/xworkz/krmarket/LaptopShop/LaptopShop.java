package com.xworkz.krmarket.LaptopShop;

public interface LaptopShop {
    default void displaysLaptop() {
        System.out.println("Displaying laptops in the shop.");
    }
    public void sellLaptop();
    public void repairLaptop();
}
