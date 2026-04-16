package com.xworkz.krmarket.showrom.impl;

public interface Car {
    default void getDetails(){
        System.out.println("Executing get details in Car..");

    }
   public void getColors();

   public void invest();
}
