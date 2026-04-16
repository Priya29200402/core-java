package com.xworkz.task5;

enum Category {
    HERO, VILLAIN, SUPPORTING_ACTOR, COMEDIAN
}
public class Actor {
    String name;
    int age;
    Category category;
    String[] actresses;
    Info info;


    public Actor(String name, int age, Category category, String[] actresses, Info info) {
        this.name = name;
        this.age = age;
        this.category = category;
        this.actresses = actresses;
        this.info = info;
    }

    void info() {
        System.out.println("Actor Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Category: " + category);
        System.out.println("Info: " + info);



    }

     public String toString() {
         return "Actor{" + "name='" + name + '\'' + ", age=" + age + ", category=" + category + ", actresses=" + java.util.Arrays.toString(actresses) + '}';
     }
}
