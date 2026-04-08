package com.xworkz.task3;

public class PanCard {
    String panNumber;
    String name;
    String fatherName;
    String dob;
    String address;

    public PanCard(String panNumber, String name, String fatherName, String dob, String address) {
        this.panNumber = panNumber;
        this.name = name;
        this.fatherName = fatherName;
        this.dob = dob;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("PAN:"+ panNumber);
        System.out.println("Name:"+ name);
        System.out.println("Father Name:"+ fatherName);
        System.out.println("DOB:"+ dob);
        System.out.println("Address:"+ address);
    }
}