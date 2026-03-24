class Salt{
    String type;
    String brand;
    double price;
    double weight;
    boolean iodized;
    String country;

    Salt(String type, String brand, double price, double weight, boolean iodized, String country){
        this.type=type;
        this.brand=brand;
        this.price=price;
        this.weight=weight;
        this.iodized=iodized;
        this.country=country;
    }

    void printInfo(){
        System.out.println("Salt Details");
        System.out.println("Type:"+this.type);
        System.out.println("Brand:"+this.brand);
        System.out.println("Price:"+this.price);
        System.out.println("Weight:"+this.weight);
        System.out.println("Iodized:"+this.iodized);
        System.out.println("Country:"+this.country);
    }
}