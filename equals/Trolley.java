package com.xworkz.equals;

public class Trolley {
    public String brand;
    public String cost;
    public int capacity;

    public Trolley(String brand, String cost, int capacity) {
        this.brand = brand;
        this.cost = cost;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Trolley{" +
                "brand='" + brand + '\'' +
                ", cost='" + cost + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Trolley){
            Trolley trolley=(Trolley) obj;
            if(this.brand==trolley.brand && this.capacity==trolley.capacity){
                return true;
            }
        }
        return super.equals(obj);
    }
}
