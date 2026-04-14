package com.xworkz.krmarket.LaptopRunner;

import com.xworkz.krmarket.LaptopShop.LaptopShop;
import com.xworkz.krmarket.LaptopShop.ShopOwner;

public class LaptopRunner {
    public static void main(String[] args) {
        LaptopShop shopOwner = new ShopOwner();
        shopOwner.displaysLaptop();
        shopOwner.sellLaptop();
        shopOwner.repairLaptop();
    }

}
