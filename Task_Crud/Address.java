package com.xworkz.task_crud;

public class Address {
    int no;
    long pinCode;
    State state;

    public Address(int no, long pinCode, State state) {
        this.no = no;
        this.pinCode = pinCode;
        this.state = state;

    }

    @Override
    public String toString() {
        return "Address{" +
                "no=" + no +
                ", pinCode=" + pinCode +
                ", state=" + state +
                '}';
    }
}