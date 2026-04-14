package com.xwrokz.task2;


public class ShopRunner{
    public static void main(String[] args) {
        //store method
        Shop[] shops = new Shop[3];
        ShopStore shopStore1 = new ShopStore(shops);
        Shop shop1 = new Shop(23, "Mahalaxmi", "Bellad Bagewadi", "Sanjay",4);
        shopStore1.store(shop1);
        shopStore1.displayAll();
        System.out.println("\n");

        shopStore1.getShopDetails(23);
        System.out.println("\n");


        shopStore1.updateShopWorkers("Mahalaxmi",5);
    }
}
