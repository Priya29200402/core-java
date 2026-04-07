package com.xwrokz.task2;

class Shop {
    int shopId;
    String shopName;
    String location;
    String owner;
    int noOfWorkers;

    public Shop(int shopId, String shopName, String location, String owner, int noOfWorkers) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.location = location;
        this.owner = owner;
        this.noOfWorkers = noOfWorkers;
    }

    public void displayInfo() {
        System.out.println("Id:"+this.shopId);
        System.out.println("Shop Name:"+this.shopName);
        System.out.println("Location:"+this.location);
        System.out.println("Owner:"+this.owner);
        System.out.println("No of Workers:"+this.noOfWorkers);
    }
}