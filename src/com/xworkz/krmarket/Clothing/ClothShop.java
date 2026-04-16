package com.xworkz.krmarket.Clothing;

public interface ClothShop {
    default void openShop() {
        System.out.println("Cloth shop is open");
    }
    void sellCloth();

    void closeShop();

}
