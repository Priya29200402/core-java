class Ocean extends BlueWhale{

    Ocean(double length, double weight, String ocean){
        super(length,weight,ocean);
    }

    Ocean(){
        super(25.0,150000,"Pacific");
    }

    Ocean(double length){
        super(length,140000,"Indian Ocean");
    }
}