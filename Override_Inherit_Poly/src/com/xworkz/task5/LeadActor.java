package com.xworkz.task5;

public class LeadActor extends Actor {
    String leadRole;
    int experience;

    public LeadActor(String name, int age, Category category, String[] actresses, Info info, String leadRole, int experience) {
        super(name, age, category, actresses, info);
        this.leadRole = leadRole;
        this.experience = experience;
    }

    void displayLeadActorInfo() {
        super.info();
        System.out.println("Lead Role:" + leadRole);
        System.out.println("Experience:" + experience);
    }

     public String toString() {
          return "LeadActor{" + "name='" + name + '\'' + ", age=" + age + ", category=" + category + ", actresses=" + java.util.Arrays.toString(actresses) + ", leadRole='" + leadRole + '\'' + ", experience=" + experience + '}';
      }

}
