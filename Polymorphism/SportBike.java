package com.internship.override;

public class SportBike extends Bike {
    @Override
    public void ride(){
        System.out.println("Racing With Sport Bike");
    }

    public static void main(String[] args) {
        SportBike sportBike=new SportBike();
        sportBike.ride();
    }
}
