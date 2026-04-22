package com.xworkz.task_crud;

public class President {
    String name;
    int age;
    Address address;

    public President(Address address, int age, String name) {
        this.address = address;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "President{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}