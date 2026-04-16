package com.xworkz.task15;

public class Doctor extends Stich{
    String name;
    int experience;

    public Doctor(String name, int experience, String surgery, int i) {
        super(name, experience);

        this.name = name;
        this.experience = experience;
    }
    @Override
    void countStich(){
        System.out.println("Doctor is counting stich");
    }
    @Override
    void removeStich(){
        System.out.println("Doctor is removing stich");
    }

    @Override
    public String toString() {
        return "Doctor{" + "name='" + name + '\'' + ", experience=" + experience + '}';
    }
}
