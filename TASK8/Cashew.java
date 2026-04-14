class Cashew{

    CashewType type;
    Farm farm;
    int price;

    Cashew(CashewType type, Farm farm, int price){
        this.type = type;
        this.farm = farm;
        this.price = price;
    }

    void printInfo(){
        System.out.println("Cashew Type:"+this.type);

        if(this.farm!=null){
            this.farm.getInfo();
        }
        else{
            System.out.println("Farm cannot be null");
        }

        System.out.println("Price:"+this.price);
    }
}