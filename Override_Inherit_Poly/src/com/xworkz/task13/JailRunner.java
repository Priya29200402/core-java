package com.xworkz.task13;

import com.xworkz.task11.Info;
import com.xworkz.task12.Currency;
import com.xworkz.task2.Category;

public class JailRunner {
    public static void main(String[] args) {
        Location location = new Location("Bangalore");
        System.out.println(location);

        Category category = new Category("High Security");
        System.out.println(category);

        Currency currency = new Currency("Indian Rupee");
        System.out.println(currency);

        Info info = new Info("Government", 10);
        System.out.println(info);

        Jail jail=new Jail("Central Jail",location,category,currency,info);
        System.out.println(jail);
        jail.getInfo();
        jail.getThievesInfo();
    }
}
