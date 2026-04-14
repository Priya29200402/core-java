package com.xworkz.krmarket.Road;

public class Government implements Road {
    @Override
    public void maintain() {
        System.out.println("Government is maintaining the road...");
    }

    @Override
    public void repair() {
        System.out.println("Government is repairing the road...");
    }
}
