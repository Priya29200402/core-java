package com.xworkz.equals;

public class Wire {
    public String type;
    public double length;
    public double cost;



    public Wire(String type, double length, double cost) {
        this.type = type;
        this.length = length;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Wire){
            Wire wire=(Wire) obj;
            if(this.type == wire.type){
                return true;
            }
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Wire{" + "type='" + type + '\'' + ", length=" + length +
                ", cost=" + cost +
                '}';
    }

}
