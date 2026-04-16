package com.xworkz.task9;

import java.util.Arrays;

public class LeatherBelt extends Belt {
    String leatherType;

    public LeatherBelt(String[] brands, double price, int length, MaterialType materialType, String leatherType) {
        super(brands, BeltType.LEATHER, price, length, materialType);
        this.leatherType = leatherType;
    }

    @Override
    void wear() {
        super.wear();
    }
    @Override
    void buckle() {

        super.buckle();
    }

    @Override
    public String toString() {
        return "LeatherBelt{" + "length=" + length + ", leatherType='" + leatherType + '\'' + ", brands=" + Arrays.toString(brands) +
                ", price=" + price + ", type=" + type + ", materialType=" + materialType + '}';
    }
}
