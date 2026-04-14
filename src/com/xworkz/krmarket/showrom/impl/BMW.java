package com.xworkz.krmarket.showrom.impl;

public class BMW implements Car{
    @Override
    public void getDetails() {
        Car.super.getDetails();
    }

    @Override
    public void getColors() {
        System.out.println("Getting all available colors of Car");

    }

    @Override
    public void invest() {
        System.out.println("Investing in our Car Company...");

    }
}
