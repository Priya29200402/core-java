package com.xworkz.krmarket.MobileShop;

public interface Mobile {
    default void getDetails() {
        System.out.println("Getting mobile details...");
    }

    public void manufacture();

    public void sell();
}
