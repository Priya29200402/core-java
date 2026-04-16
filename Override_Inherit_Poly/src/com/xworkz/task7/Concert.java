package com.xworkz.task7;

enum Type {
    ROCK, POP, JAZZ, CLASSICAL, HIPHOP
}
public class Concert {
    String name;
    String location;
    Type type;
    int duration;
    Program[] programs;

    public Concert(String name, String location, Type type, int duration) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Concert Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Type: " + type);
        System.out.println("Duration: " + duration + " hours");
    }
    void getDetails(){
        System.out.println("Get details of concert");
    }
    void getProgramDetails(){
        System.out.println("Get details of program");
    }
    @Override
    public String toString() {
        return "Concert [name=" + name + ", location=" + location + ", type=" + type + ", duration=" + duration + "]";
    }
}
