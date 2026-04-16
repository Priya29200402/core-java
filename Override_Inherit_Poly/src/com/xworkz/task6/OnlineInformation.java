package com.xworkz.task6;

public class OnlineInformation extends Information {
    String website;
    String email;

    public OnlineInformation(String name, Type director, String producer, String website, String email) {
        super(name, director, producer);
        this.website = website;
        this.email = email;
    }

    @Override
    void displayInfo() {
        System.out.println("Name:" + name);
        System.out.println("Type:" + type);
        System.out.println("Creator:" + creator);
        System.out.println("Website:" + website);
        System.out.println("Email:" + email);
    }

    @Override
    void getInfo() {

        super.getInfo();
    }

    @Override
    public String toString() {
        return "OnlineInformation{" + "name='" + name + '\'' + ", type=" + type + ", creator='" + creator + '\'' + ", website='" + website + '\'' + ", email='" + email + '\'' + '}';
    }
}
