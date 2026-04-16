package com.xworkz.task15;

public class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Patient{" + "name='" + name + '\'' + '}';
    }
}
