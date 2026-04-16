package com.xworkz.task1;

public class SlipperRunner {

    public static void main(String[] args) {
        Slipper slipper1 = new Slipper(Brand.NIKE, "Red", new int[]{38, 39, 40}, 49.99, new Category("Sport"));
        System.out.println(slipper1);
        slipper1.info();
        slipper1.wear();

        FancySlipper fancySlipper1 = new FancySlipper(Brand.ADIDAS, "Black", new int[]{36, 37, 38}, 79.99, new Category("Casual"), "Leather", true);
        System.out.println(fancySlipper1);
        fancySlipper1.info();
        fancySlipper1.wear();
    }
}
