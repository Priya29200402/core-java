package com.xworkz.task3;

enum Type {
    BIKE_HELMET, MOTORCYCLE_HELMET, SKATEBOARD_HELMET, SNOWBOARD_HELMET, CLIMBING_HELMET
}
public class Helmet {
    String[] brands;
    Type type;
    String material;
    double price;
    Material materialType;


    Helmet(String[] brands, Type type, String material, double price) {
        this.brands = brands ;
        this.type = type;
        this.material = material;
        this.price = price;
    }


    void info(){

        System.out.println("Getting info about the helmet");
    }
    void wear(){

        System.out.println("Wearing the helmet");
    }
        public String toString() {
            return "Helmet{" + "brand='" + brands + '\'' + ", type=" + type + ", material='" + material + '\'' + ", price=" + price +
                    ", materialType=" + (materialType != null ? materialType.type : "null") + '}';
        }
}
