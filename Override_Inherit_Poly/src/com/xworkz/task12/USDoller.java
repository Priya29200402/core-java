package com.xworkz.task12;

public class USDoller extends Dollar {
    String country;

    USDoller(String name, double value, Currency currency, String country) {
        super(name, new double[]{value}, currency);
        this.country = country;
    }

    @Override
    void getInfo() {
        System.out.println("US Dollar Info");
        super.getInfo();
    }

    @Override
    void use() {
        System.out.println("Using US Dollar");
        super.use();
    }

    @Override
    public String toString() {
        return "USDoller{" + "country='" + country + '\'' + '}';
    }
}
