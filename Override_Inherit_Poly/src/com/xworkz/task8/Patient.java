package com.xworkz.task8;

import java.util.Arrays;

public class Patient extends MedicalShop {
    String name;
    int age;
    String ailment;

    public Patient(String name, int age, String ailment, String shopName, String[] locations, MedicineType medicineType, int numberOfMedicines) {
        super(shopName, locations, medicineType, numberOfMedicines);
        this.name = name;
        this.age = age;
        this.ailment = ailment;
    }

    @Override
    void getDetails() {
        System.out.println("Patient Details");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Ailment:" + ailment);
        super.getDetails();
    }

    @Override
    void getMedicineDetails() {
        System.out.println("Patient Medicine Details");
        super.getMedicineDetails();
    }

    @Override
    public String toString() {
        return "Patient{" + "name='" + name + '\'' + ", age=" + age + ", ailment='" + ailment + '\'' + ", locations=" + Arrays.toString(locations) + ", name='" + name + '\'' + ", medicineType=" + medicineType +
                ", numberOfMedicines=" + numberOfMedicines + ", recipt=" + recipt + '}';
    }
}
