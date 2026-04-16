package com.xworkz.task15;

enum StichType {
    HAND_STICH, MACHINE_STICH, OVERLOCK_STICH;
}
public class Stich {
    String name;
    StichType type;
    int[] length;
    Patient patient;
    boolean isInfected;


    public Stich(String name, int type, String length, String patient, int isInfected) {
        this.name = name;
        this.type = type;
        this.length = length;
        this.patient = patient;
        this.isInfected = isInfected;
    }

    public Stich(String name, int experience) {
    }

    void countStich(){
        System.out.println("Total stiches");
    }
    void removeStich(){
        System.out.println("Removing the stich");
    }


    @Override
    public String toString() {
        return "Stich{" + "name='" + name + '\'' + ", type=" + type + ", length=" + length + '}';
    }
}
