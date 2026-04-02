class ButterDetails extends Butter{

    ButterDetails(String brand, double price, boolean expired){
        super(brand,price,expired);
    }

    ButterDetails(){
        super("Amul",50,true);
    }

    ButterDetails(String brand){
        super(brand,60,false);
    }
}