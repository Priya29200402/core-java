class Horlicks{

    HorlicksCompany company;
    Flavor flavor;
    int price;

    Horlicks(HorlicksCompany company, Flavor flavor, int price){
        this.company = company;
        this.flavor = flavor;
        this.price = price;
    }

    void printInfo(){
        System.out.println("Horlicks Company:"+this.company);

        if(this.flavor!=null){
            this.flavor.getInfo();
        }
        else{
            System.out.println("Flavor cannot be null");
        }

        System.out.println("Price:"+this.price);
    }
}