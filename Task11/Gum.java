class Gum{
    String brand;
    String flavor;
    double price;
    boolean sugarFree;
    int quantity;
    String color;

    Gum(String brand, String flavor, double price, boolean sugarFree, int quantity, String color){
        this.brand=brand;
        this.flavor=flavor;
        this.price=price;
        this.sugarFree=sugarFree;
        this.quantity=quantity;
        this.color=color;
    }

    void printInfo(){
        System.out.println("Gum Details:");
        System.out.println("Brand:"+ this.brand);
        System.out.println("Flavor:"+ this.flavor);
        System.out.println("Price:"+ this.price);
        System.out.println("Sugar Free:"+this.sugarFree);
        System.out.println("Quantity:"+this.quantity);
        System.out.println("Color:"+this.color);
    }
}