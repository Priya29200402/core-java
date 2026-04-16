package com.xworkz.task12;

public class DollarRunner {
    public static void main(String[] args) {
        Currency usdCurrency = new Currency("USD");
        USDoller usd = new USDoller("US Dollar", 1.0, usdCurrency, "United States");

        System.out.println(usd);
        usd.getInfo();
        usd.use();

        Dollar doller = new Dollar(Type.USD, new double[]{1.0, 5.0, 10.0, 20.0, 50.0, 100.0}, usdCurrency, "USD", 123456789L);
        System.out.println(doller);
        doller.getInfo();
        doller.use();
}
