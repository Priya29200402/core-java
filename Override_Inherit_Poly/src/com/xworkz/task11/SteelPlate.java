package com.xworkz.task11;

public class SteelPlate extends Plate{
    String grade;
    String type;

    SteelPlate(String material, double thickness, double length, double width, Info info, String grade, String type) {
        super(new String[]{"Ashoka", "Preeti"}, 100, false, Type.STEEL, info);
        this.grade = grade;
        this.type = type;
    }

    @Override
    void getInfo() {
        super.getInfo();
    }

    @Override
    void use() {
        super.use();
    }

    @Override
    public String toString() {
        return "SteelPlate{" + "grade='" + grade + '\'' + ", type='" + type + '\'' + '}';
    }
}
