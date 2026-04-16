package com.xworkz.task8;

public class MedicalShopRunner {
    public static void main(String[] args) {
        String[] locations = {"Bangalore", "Mysore", "Hubli"};
        MedicalShop medicalShop = new MedicalShop("HealthPlus", locations, MedicineType.TABLET, 100);
        medicalShop.getDetails();
        System.out.println(medicalShop);

        Patient patient = new Patient("Vikram", 30, "Fever", "HealthPlus", locations, MedicineType.SYRUP, 5);
        patient.getDetails();
        System.out.println(patient);

        Recipt recipt = new Recipt(500.0, 5);
        recipt.getDetails();
        System.out.println(recipt);
    }
}
