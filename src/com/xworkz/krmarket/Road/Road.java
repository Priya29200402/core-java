package com.xworkz.krmarket.Road;

public interface Road {
    default void build() {
        System.out.println("Building the road...");
    }
    public void maintain();
    public void repair();
}
