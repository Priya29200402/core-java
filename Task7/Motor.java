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
	if(this.company!=null){
		this.company.getInfo();
	}
	else{
		System.out.println("Company Name is NUll");
	}
	if(this.type!=null){
		this.type.getInfo();
	}
	else{
	   System.out.println("Motor type is NUll");	
	}
	if(this.color!=null){
		this.color.getInfo();
	}
	else{
		System.out.println("Color is NUll");
	}
	if(this.speed!=null){
		this.speed.getInfo();
	}
	else{
		System.out.println("Motor speed is NUll");
	}
	if(this.usage!=null){
		this.usage.getInfo();
	}
	else{
		System.out.println("Motor usage is NUll");
	}
    }
}