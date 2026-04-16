package com.xworkz.task11;

enum Type{
    PLASTIC,STEEL,GLASS,WOOD;
}
public  class Plate {
        String[] brand;
        int cost;
        boolean isthrowable;
        Type type;
        Info info;

        Plate(String[] brand, int cost, boolean isthrowable, Type type, Info info) {
            this.brand = brand;
            this.cost = cost;
            this.isthrowable = isthrowable;
            this.type = type;
            this.info = info;
        }
        void getInfo(){
            System.out.println("Getting info about the plate");
        }
        void use(){
            System.out.println("Using the plate");
        }


    public String toString() {
            return "Plate{" + "brand=" + java.util.Arrays.toString(brand) + ", cost=" + cost + ", isthrowable=" + isthrowable + ", type=" + type + ", info=" + info + '}';
        }
}
