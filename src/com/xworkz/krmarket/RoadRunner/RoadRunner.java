package com.xworkz.krmarket.RoadRunner;

import com.xworkz.krmarket.Road.Government;

public class RoadRunner {
    public static void main(String[] args) {
        Government government = new Government();
        government.build();
        government.maintain();
        government.repair();
    }
}
