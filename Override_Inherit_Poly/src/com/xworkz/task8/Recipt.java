package com.xworkz.task8;

public class Recipt {
    double totalAmount;
    int numberOfItems;

    Recipt(double totalAmount, int numberOfItems) {
        this.totalAmount = totalAmount;
        this.numberOfItems = numberOfItems;
    }
        void getDetails(){
            System.out.println("Get details of recipt");
        }
        @Override
        public String toString() {
            return "Recipt [totalAmount=" + totalAmount + ", numberOfItems=" + numberOfItems + "]";
        }
}
