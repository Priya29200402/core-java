package com.xworkz.krmarket.Building;

public class BuildingOwner implements Building {

    @Override
    public void construct() {
        System.out.println("Constructing the building...");
    }

    @Override
    public void demolish() {
        System.out.println("Demolishing the building...");
    }
}
