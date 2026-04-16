package com.xworkz.krmarket.ClothRunner;

import com.xworkz.krmarket.Clothing.Cloth;

public class ClothRunner {
    public static void main(String[] args) {
        Cloth cloth = new Cloth();
        cloth.openShop();
        cloth.sellCloth();
        cloth.closeShop();
    }
}
