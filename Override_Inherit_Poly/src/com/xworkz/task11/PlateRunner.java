package com.xworkz.task11;

public class PlateRunner {
    public static void main(String[] args) {
        Info info = new Info("Ashoka", 5);
        SteelPlate steelPlate = new SteelPlate("Steel", 10, 100, 50, info, "A36", "Structural");
        System.out.println(steelPlate);
        steelPlate.getInfo();
        steelPlate.use();

        Plate plate = new Plate(new String[]{"Ashoka", "Preeti"}, 100, false, Type.STEEL, info);
        System.out.println(plate);
        plate.getInfo();
        plate.use();
    }
}
