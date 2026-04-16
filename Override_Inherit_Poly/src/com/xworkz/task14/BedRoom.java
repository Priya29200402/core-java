package com.xworkz.task14;

public class BedRoom extends Room {
    String bedType;

    public BedRoom(String name, double area, String bedType, boolean b, String kingSize, boolean b1) {
        super(name, area, "Wooden", true);
        this.bedType = bedType;
    }
    @Override
    void info(){
        System.out.println("Info about the bedroom");
    }
    @Override
    void use(){
        System.out.println("Using the bedroom");
    }

    @Override
    public String toString() {
        return "BedRoom{" + "name='" + name + '\'' + ", area=" + area + ", bedType='" + bedType + '\'' + '}';
    }
}
