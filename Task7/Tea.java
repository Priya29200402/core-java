class Tea{

    String brand;
    int quantity;
    double price;
    boolean hot;
    int cups;

    TeaType type;
    TeaOrigin origin;
    TeaColor color;
    TeaFlavor flavor;
    TeaCompany company;

    Tea(String brand,int quantity,double price,boolean hot,int cups,
        TeaType type,TeaOrigin origin,TeaColor color,TeaFlavor flavor,TeaCompany company){

        this.brand=brand;
        this.quantity=quantity;
        this.price=price;
        this.hot=hot;
        this.cups=cups;

        this.type=type;
        this.origin=origin;
        this.color=color;
        this.flavor=flavor;
        this.company=company;
    }

    void getTeaDetails(){

        System.out.println("Brand:"+this.brand);
        System.out.println("Quantity:"+this.quantity);
        System.out.println("Price:"+this.price);
        System.out.println("Hot:"+this.hot);
        System.out.println("Cups:"+this.cups);

        if(this.type!=null){
			this.type.getInfo();
		}
		else{
			System.out.println(" Type is null");
		}
		if(this.origin!=null){
			this.origin.getInfo();
		}else{
			System.out.println(" Origin is null");
		}
		if(this.color!=null){
			this.color.getInfo();
		}
		else{
			System.out.println(" Color is null");
		}
		if(this.flavor!=null){
			this.flavor.getInfo();
		}
		else{
			System.out.println(" Flavour is null");
		}
		if(this.company!=null){
			this.company.getInfo();
		}
		else{
			System.out.println(" company is null");
		}
    }
}