package com.xworkz.task3;

public class PanCardRunner {
    public static void main(String[] args) {

        PanCard[] pans = new PanCard[3];
        PanCardStore store = new PanCardStore(pans);

        PanCard panCard1 = new PanCard("IYBM2333B", "Priyanka", "Basavanni", "29-02-2004", "Bangalore");
        PanCard panCard2 = new PanCard("PYM234A", "Pooja", "Dayanand", "13-03-2003", "Belagavi");

        store.store(panCard1);
        store.store(panCard2);

        System.out.println("\nAll PAN Cards:");
        store.displayAll();

        System.out.println("\nSearch");
        store.getPanDetails("IYBM2333B");

        System.out.println("\nUpdate");
        store.updatePanAddress("PYM234A","Banglore");


    }
}
