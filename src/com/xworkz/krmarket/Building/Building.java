package com.xworkz.krmarket.Building;

public interface Building {

    default void getDetails() {
        System.out.println("Getting building details...");
    }

    public void construct();

    public void demolish();
}
