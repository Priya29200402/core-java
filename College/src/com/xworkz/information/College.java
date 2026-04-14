package com.xworkz.information;

public class College {
        String name;
        int yearFounded;

    public College(String name, int yearFounded) {
        this.name = name;
        this.yearFounded = yearFounded;
    }

    public void getInfo(){
        System.out.println("College Name:"+name);
        System.out.println("Year of Founded:"+yearFounded);
    }


}
