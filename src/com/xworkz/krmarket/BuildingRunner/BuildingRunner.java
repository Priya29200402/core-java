package com.xworkz.krmarket.BuildingRunner;

import com.xworkz.krmarket.Building.BuildingOwner;

public class BuildingRunner {
    public static void main(String[] args) {
        BuildingOwner owner = new BuildingOwner();
        owner.getDetails();
        owner.construct();
        owner.demolish();
    }
}
