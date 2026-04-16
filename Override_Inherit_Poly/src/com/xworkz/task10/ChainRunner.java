package com.xworkz.task10;

public class ChainRunner {
    public static void main(String[] args) {
        Seller seller = new Seller("Ashok");
        String[] brands = {"Tanishq", "Kalyan"};
        GoldChain goldChain = new GoldChain(brands, ChainType.GOLD, 50000.0, 20, seller, "Tanishq", 22);
        goldChain.info();
        System.out.println(goldChain);
        goldChain.wear();

        Chain chain = new Chain(brands, ChainType.SILVER, 2000.0, 18, seller);
        chain.info();
        System.out.println(chain);
        chain.wear();
    }
}
