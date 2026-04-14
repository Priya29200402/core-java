package com.xworkz.krmarket.Hospital;

public class Doctor implements Hospital {
    @Override
    public void ambulance() {
        System.out.println("Checking ambulance is available in Hospital");
    }

    @Override
    public void operationTheater() {
        System.out.println("Checking operation theater is available in Hospital");
    }
}
