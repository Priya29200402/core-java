class Mushroom{

    MushroomType type;
    FarmHouse farmHouse;
    int price;

    Mushroom(MushroomType type, FarmHouse farmHouse, int price){
        this.type = type;
        this.farmHouse = farmHouse;
        this.price = price;
    }

    void printInfo(){
        System.out.println("Mushroom Type:"+this.type);

        if(this.farmHouse!=null){
            this.farmHouse.getInfo();
        }
        else{
            System.out.println("FarmHouse cannot be null");
        }

        System.out.println("Price:"+this.price);
    }
}