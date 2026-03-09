class Wallnut{

    WallnutType type;
    Supplier supplier;
    int price;

    Wallnut(WallnutType type, Supplier supplier, int price){
        this.type = type;
        this.supplier = supplier;
        this.price = price;
    }

    void printInfo(){
        System.out.println("Wallnut Type:"+this.type);

        if(this.supplier!=null){
            this.supplier.getInfo();
        }
        else{
            System.out.println("Supplier cannot be null");
        }

        System.out.println("Price:"+this.price);
    }
}