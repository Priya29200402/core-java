class Sambar{
    String type;
    String mainIngredient;
    double quantity;
    boolean isSpicy;
    double price;
    String region;

    Sambar(String type, String mainIngredient, double quantity, boolean isSpicy, double price, String region){
        this.type=type;
        this.mainIngredient=mainIngredient;
        this.quantity=quantity;
        this.isSpicy=isSpicy;
        this.price=price;
        this.region=region;
    }

    void printInfo(){
        System.out.println("Sambar Details");
        System.out.println("Type:"+this.type);
        System.out.println("Main Ingredient:"+this.mainIngredient);
        System.out.println("Quantity:"+this.quantity);
        System.out.println("Spicy:"+this.isSpicy);
        System.out.println("Price:"+this.price);
        System.out.println("Region:"+this.region);
    }
}