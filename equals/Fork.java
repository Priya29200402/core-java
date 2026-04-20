package com.xworkz.equals;

public class Fork {
    public String material;
    public double cost;
    public int quantity;

    public Fork(String material, double cost, int quantity) {
        this.material = material;
        this.cost = cost;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Fork{" +
                "material='" + material + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Fork){
            Fork fork=(Fork) obj;
            if(this.material == fork.material && this.quantity == fork.quantity){
                return true;
            }
        }
        return super.equals(obj);
    }
}
