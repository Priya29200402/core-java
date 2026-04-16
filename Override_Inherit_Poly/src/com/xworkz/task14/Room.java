package com.xworkz.task14;
enum Type {
    BEDROOM, KITCHEN, LIVING_ROOM, BATHROOM
}
public class Room {

    String[] name;
    Type type;
    double area;
    Building building;
    int floor;


    public Room(String[] name, Type type, double area,Building building, int floor) {
        this.name = name;
        this.type = type;
        this.area = area;
        this.building=building;
        this.floor=floor;
    }

    public Room(String name, double area, String wooden, boolean b) {
    }

    void info(){
        System.out.println("Info about the room");
        
    }
    void use(){
        System.out.println("Using the room");
    }


    @Override
    public String toString() {
        return "Room{" + "name='" + name + '\'' + ", type=" + type + ", area=" + area + '}';
    }
}
