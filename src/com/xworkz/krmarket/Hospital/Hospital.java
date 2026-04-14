package com.xworkz.krmarket.Hospital;

public interface Hospital {
    default void doctor() {
        System.out.println("Checking  doctor is available in Hospital");
    }
    void ambulance();
    void operationTheater();

}
