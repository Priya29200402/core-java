package com.internship.override;

public class BMW extends Car {
    @Override
    public void drive(){
        System.out.println("Self Drive");
    }

    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.drive();
    }
}
