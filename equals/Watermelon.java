package com.xworkz.equals;

public class Watermelon {
    public double cost;
    public boolean fresh;
    public boolean natural;

    public Watermelon(double cost, boolean fresh, boolean natural) {
        this.cost = cost;
        this.fresh = fresh;
        this.natural = natural;
    }

    @Override
    public String toString() {
        return "Watermelon{" +
                "cost=" + cost +
                ", fresh=" + fresh +
                ", natural=" + natural +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Watermelon){
            Watermelon watermelon=(Watermelon) obj;
            if(this.cost == watermelon.cost && this.fresh == watermelon.fresh && this.natural == watermelon.natural){
                return true;
            }
        }
        return super.equals(obj);
    }
}
