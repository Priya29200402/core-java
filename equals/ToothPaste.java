package com.xworkz.equals;

public class ToothPaste {
    public String brand;
    public double cost;
    public String flavor;

    public ToothPaste(String brand, double cost, String flavor) {
        this.brand = brand;
        this.cost = cost;
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "ToothPaste{" +
                "brand='" + brand + '\'' +
                ", cost=" + cost +
                ", flavor='" + flavor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ToothPaste){
            ToothPaste toothPaste=(ToothPaste) obj;
            if(this.brand==toothPaste.brand && this.flavor==toothPaste.flavor){
                return true;
            }
        }
        return super.equals(obj);
    }
}
