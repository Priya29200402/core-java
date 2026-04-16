package com.xworkz.task9;

public class BeltRunner {
    public static void main(String[] args) {
        String[] brands = {"Hermes", "Gucci", " Louis Vuitton"};
        MaterialType materialType = new MaterialType("Leather");
        LeatherBelt leatherBelt = new LeatherBelt(brands, 1500.0, 120, materialType, "Genuine Leather");
        leatherBelt.getDetails();
        System.out.println(leatherBelt);
        leatherBelt.wear();
        leatherBelt.buckle();

        Belt belt = new Belt(brands, BeltType.FABRIC, 500.0, 100, materialType);
        belt.getDetails();
        System.out.println(belt);
        belt.wear();
        belt.buckle();
    }

}
