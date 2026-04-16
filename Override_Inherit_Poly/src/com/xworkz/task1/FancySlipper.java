package com.xworkz.task1;

public class FancySlipper extends Slipper{

    String material;
    boolean hasHeel;

    public FancySlipper(Brand brand, String color, int[] sizes, double price, Category category, String material, boolean hasHeel) {
        super(brand, color, sizes, price, category);
        this.material = material;
        this.hasHeel = hasHeel;
    }

    @Override
    void info() {
        super.info();
    }

    @Override
    void wear() {
        super.wear();
    }
    public String toString() {
        return "FancySlipper material='" + material + '\'' + ", hasHeel=" + hasHeel + '}';
    }
}

