package com.xworkz.task11;

public class Info {
    String company;
    int warranty;

    public Info(String company, int warranty) {
        this.company = company;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Info{" + "company='" + company + '\'' + ", warranty=" + warranty + '}';
    }
}
