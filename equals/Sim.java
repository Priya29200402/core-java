package com.xworkz.equals;

public class Sim {
    public String company;
    public long number;
    public  boolean is5G;

    public Sim(String company, long number, boolean is5G) {
        this.company = company;
        this.number = number;
        this.is5G = is5G;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "company='" + company + '\'' +
                ", number=" + number +
                ", is5G=" + is5G +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Sim){
            Sim sim=(Sim) obj;
            if(this.company==sim.company && this.is5G==sim.is5G){
                return true;
            }
        }
        return super.equals(obj);
    }
}
