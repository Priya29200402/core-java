class ChickenShop extends Chicken{

    ChickenShop(String type, double weight, String color){
        super(type,weight,color);
    }

    ChickenShop(){
        super("Broiler",2.5,"White");
    }

    ChickenShop(String type){
        super(type,2.0,"Brown");
    }
}