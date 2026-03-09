class Beer{

    BeerBrand brand;
    Brewery brewery;
    int price;

    Beer(BeerBrand brand, Brewery brewery, int price){
        this.brand = brand;
        this.brewery = brewery;
        this.price = price;
    }

    void printInfo(){
        System.out.println("Beer Brand:"+this.brand);

        if(this.brewery!=null){
            this.brewery.getInfo();
        }
        else{
            System.out.println("Brewery cannot be null");
        }

        System.out.println("Price:"+this.price);
    }
}