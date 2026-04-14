package com.xworkz.krmarket.MobileRunner;

import com.xworkz.krmarket.MobileShop.Company;

public class MobileRunner {
    public static void main(String[] args) {
        Company company = new Company();
        company.manufacture();
        company.sell();
        company.getDetails();
    }
}
