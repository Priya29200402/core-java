package com.xworkz.task3;

public class HelmetRunner {
    public static void main(String[] args) {
        Material material = new Material("Polycarbonate");
        SafeHelmet safeHelmet = new SafeHelmet("BrandA", Type.BIKE_HELMET, "M",material, "DOT", true);
        System.out.println(safeHelmet);
        safeHelmet.info();
        safeHelmet.wear();
    }
}
