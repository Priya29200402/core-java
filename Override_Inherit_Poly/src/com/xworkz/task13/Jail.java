package com.xworkz.task13;

import com.xworkz.task11.Info;
import com.xworkz.task12.Currency;
import com.xworkz.task2.Category;

import java.util.Arrays;

enum CrimeType {
    THEFT, ROBBERY, MURDER, ASSAULT, FRAUD;
}
public class Jail {
    String[] name;
    int noOfThieves;
    int noOfPolices;
    CrimeType crimeType;
    Location location;

    public Jail(String[] name, int noOfThieves) {
        this.name = name;
        this.noOfThieves = noOfThieves;
        this.noOfPolices = noOfPolices;
        this.crimeType = crimeType;
        this.location = location;
    }

    public Jail(String centralJail, Location location, Category category, Currency currency, Info info) {
    }

    void getInfo(){
        System.out.println("getting Information about Jail");
    }
    void getThievesInfo(){
        System.out.println("Getting Information about thieves");
    }

    @Override
    public String toString() {
        return "Jail{" + "name=" + Arrays.toString(name) + ", noOfThieves=" + noOfThieves + ", noOfPolices=" + noOfPolices +
                ", crimeType=" + crimeType + ", location=" + location + '}';
    }
}

