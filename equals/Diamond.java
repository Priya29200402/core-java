package com.xworkz.equals;

public class Diamond {
    public String brand;
    public double cost;
    public String diamondType;

    public Diamond(String brand, double cost, String diamondType) {
        this.brand = brand;
        this.cost = cost;
        this.diamondType = diamondType;
    }

    @Override
    public String toString() {
        return "Diamond{" +
                "brand='" + brand + '\'' +
                ", cost=" + cost +
                ", diamondType='" + diamondType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Diamond){
            Diamond diamond=(Diamond) obj;
            if(this.brand==diamond.brand && this.diamondType==diamond.diamondType){
                return true;
            }
        }
        return super.equals(obj);
    }
}
