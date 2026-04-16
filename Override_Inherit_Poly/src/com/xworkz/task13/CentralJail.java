package com.xworkz.task13;

import java.util.Arrays;

public class CentralJail extends Jail {
    Location location;

    CentralJail(String name, int capacity, Location location) {
        super(new String[]{name}, capacity);
        this.location = location;
    }

    @Override
    void getInfo() {
        super.getInfo();
    }

    @Override
    void getThievesInfo() {
        super.getThievesInfo();
    }

    @Override
    public String toString() {
        return "CentralJail{" + "name='" + Arrays.toString(name) + '\'' + ", capacity=" + location + ", location=" + location.name + '}';
    }
}
