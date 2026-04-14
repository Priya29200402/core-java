package com.xworkz;

class ToyRunner{
    public static void main(String[] args) {
        //store method
        Toy[] toys = new Toy[3];
        ToyStore toyStore1 = new ToyStore(toys);
        Toy toy1 = new Toy(12, "Car", "Funskool", 350, "Electronics");
        toyStore1.store(toy1);
        toyStore1.displayAll();
        System.out.println("\n");

        toyStore1.getToyDetails(12);


        toyStore1.updateToyPrice("Car",400);
    }
}