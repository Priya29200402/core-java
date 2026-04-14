class Paneer{

    PaneerBrand brand;
    Dairy dairy;
    int price;

    Paneer(PaneerBrand brand, Dairy dairy, int price){
        this.brand = brand;
        this.dairy = dairy;
        this.price = price;
    }

    void printInfo(){
        System.out.println("Paneer Brand:"+this.brand);

        if(this.dairy!=null){
            this.dairy.getInfo();
        }
        else{
            System.out.println("Dairy cannot be null");
        }

        System.out.println("Price:"+this.price);
    }
}