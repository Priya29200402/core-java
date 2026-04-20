package com.xworkz.equals;

public class Runner {
    public static void main(String[] args) {
        Wire wire1=new Wire("Copper",14.5,1200);

        Wire wire2=new Wire("Copper",13.7,1300);

       boolean sameWire= wire1.equals(wire2);
       System.out.println("Wire:"+sameWire);

       Watermelon watermelon1=new Watermelon(500,true,true);
       Watermelon watermelon2=new Watermelon(500,true,true);

       boolean sameWatermelon=watermelon1.equals(watermelon2);
       System.out.println("Watermelon:"+sameWatermelon);

       Crown crown1=new Crown("Silver","Elizibet",40000);
       Crown crown2=new Crown("Silver","Elizibet",40000);
       boolean sameCrown=crown1.equals(crown2);
        System.out.println("Crown:"+sameCrown);
    }
}
