package com.xworkz.krmarket.shop.impl;

import com.xworkz.krmarket.shop.Shop;

public class Vegitableimpl implements Shop {


    @Override
    public void business() {
        System.out.println("We are Selling Fresh Vegetables");
    }

    @Override
    public void invest() {
        System.out.println("Investing in our Vegetable Shop");

    }
}
