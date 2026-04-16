package com.xworkz.task8;

import java.util.Arrays;

enum MedicineType{
    TABLET, SYRUP, INJECTION, OINTMENT, CAPSULE
}
public class MedicalShop {
    String name;
    String[] locations;
    MedicineType medicineType;
    int numberOfMedicines;
    Recipt recipt;


    public MedicalShop(String name, String[] locations, MedicineType medicineType, int numberOfMedicines) {
        this.name = name;
        this.locations = locations;
        this.medicineType = medicineType;
        this.numberOfMedicines = numberOfMedicines;
    }

    public void displayDetails() {
        System.out.println("Medical Shop Name: " + name);
        System.out.println("Location: " + Arrays.toString(locations));
        System.out.println("Medicine Type: " + medicineType);
        System.out.println("Number of Medicines: " + numberOfMedicines);
    }
     void getDetails(){
         System.out.println("Get details of medical shop");
     }
     void getMedicineDetails(){
         System.out.println("Get details of medicine");
     }
     @Override
     public String toString() {
         return "MedicalShop [name=" + name + ", location=" + Arrays.toString(locations) + ", medicineType=" + medicineType
                 + ", numberOfMedicines=" + numberOfMedicines + "]";
     }
}
