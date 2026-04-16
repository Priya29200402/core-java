package com.xworkz.task6;

enum Type {
    MOVIE, BOOK, MUSIC, GAME
}
public class Information {
    String name;
    Type type;
    String creator;
    Book[] books;
    boolean isAvailable;

    public Information(String name, Type type, String creator) {
        this.name = name;
        this.type = type;
        this.creator = creator;
        this.books = books;
        this.isAvailable = isAvailable;
    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Creator: " + creator);
        System.out.println("Available: " + isAvailable);
    }
    void getInfo() {
        System.out.println("Getting information about " + name);
    }



    @Override
    public String toString() {
        return "Information{" + "name='" + name + '\'' + ", type=" + type + ", creator='" + creator + '\'' + '}';
    }
}
