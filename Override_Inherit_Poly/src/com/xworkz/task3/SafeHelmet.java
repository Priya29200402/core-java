package com.xworkz.task3;

public class SafeHelmet extends Helmet{
    String safetyStandard;
    boolean isLightWeight;

    SafeHelmet(String brand, Type color, String size, Material materialType, String safetyStandard, boolean isLightWeight) {
        super(brand, color, size, materialType);
        this.safetyStandard = safetyStandard;
        this.isLightWeight = isLightWeight;

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
        return "SafeHelmet{" + "safetyStandard='" + safetyStandard + '\'' +
                ", isLightWeight=" + isLightWeight + '}';
    }
}
