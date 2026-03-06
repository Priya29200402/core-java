class Motor{

    String brand;
    int power;
    double price;
    boolean electric;
    int warranty;

    MotorCompany company;
    MotorType type;
    MotorColor color;
    MotorSpeed speed;
    MotorUsage usage;

    Motor(String brand,int power,double price,boolean electric,int warranty,
          MotorCompany company,MotorType type,MotorColor color,
          MotorSpeed speed,MotorUsage usage){

        this.brand=brand;
        this.power=power;
        this.price=price;
        this.electric=electric;
        this.warranty=warranty;

        this.company=company;
        this.type=type;
        this.color=color;
        this.speed=speed;
        this.usage=usage;
    }

    void getMotorDetails(){
		
		System.out.println("Getting Motor Details");
        System.out.println("brand:"+this.brand);
        System.out.println("power:"+this.power);
        System.out.println("price:"+this.price);
        System.out.println("electric:"+this.electric);
        System.out.println("warranty:"+this.warranty);
        System.out.println("company:"+this.company);
        System.out.println("type:"+this.type);
        System.out.println("color:"+this.color);
        System.out.println("speed:"+this.speed);
        System.out.println("usage:"+this.usage);
    }
}