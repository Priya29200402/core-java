package com.xworkz.task12;

import java.util.Arrays;

enum Type{
    USD, EUR, GBP, JPY, AUD
}
public class Dollar {

    Type currencyType;
    double[] denominations;
    Currency currencyInfo;
    String dollarCode;
    long serialNumber;
    
    Dollar(Type currencyType, double[] denominations, Currency currencyInfo, String dollarCode, long serialNumber) {
        this.currencyType = currencyType;
        this.denominations = denominations;
        this.currencyInfo = currencyInfo;
        this.dollarCode = dollarCode;
        this.serialNumber = serialNumber;
    }
    
    Dollar(String name, double[] value, Currency currency) {
        this.dollarCode = name;
        this.denominations = value;
        this.currencyInfo = currency;
    }

    

    void getInfo(){
        System.out.println("Getting info about the dollar");
        
    }
    void use(){
        System.out.println("Using the dollar");
    }

    @Override
    public String toString(){
        return "Dollar{" + "currencyType=" + currencyType + ", denominations=" + Arrays.toString(denominations) +
                ", currencyInfo=" + currencyInfo + ", dollarCode='" + dollarCode + '\'' + ", serialNumber=" + serialNumber + '}';
    }
}
