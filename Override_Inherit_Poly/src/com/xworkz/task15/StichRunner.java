package com.xworkz.task15;

public class StichRunner {
    public static void main(String[] args) {
        Stich stich = new Stich("Stich", 1000, "Red", "Cotton", 10);
        System.out.println(stich);

        Doctor doctor = new Doctor("Dr. Jumbaa", 45, "Surgery", 20);
        System.out.println(doctor);
        doctor.countStich();
        doctor.removeStich();

    }
}
