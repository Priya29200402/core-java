package com.xworkz.equals;

public class Crown {
    public String material;
    public String queenName;
    public double cost;

    public Crown(String material, String queenName, double cost) {
        this.material = material;
        this.queenName = queenName;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Crown{" +
                "material='" + material + '\'' +
                ", QueenName='" + queenName + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Crown){
            Crown crown=(Crown) obj;
            if(this.material == crown.material && this.queenName == crown.queenName){
                return true;
            }
        }
        return super.equals(obj);
    }
}
