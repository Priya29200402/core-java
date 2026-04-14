package com.xworkz.krmarket.HospitalRunner;

import com.xworkz.krmarket.Hospital.Doctor;

public class HospitalRunner {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.doctor();
        doctor.ambulance();
        doctor.operationTheater();
    }
}
