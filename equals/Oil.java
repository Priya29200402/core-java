package com.xworkz.equals;

public class Oil {
    public String type;
    public double cost;
    public String brand;

    public Oil(String type, double cost, String brand) {
        this.type = type;
        this.cost = cost;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Oil{" +
                "type='" + type + '\'' +
                ", cost=" + cost +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Oil){
            Oil oil=(Oil) obj;
            if(this.type==oil.type && this.brand==oil.brand){
                return true;
            }
        }
        return super.equals(obj);
    }
}
