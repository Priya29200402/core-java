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

        System.out.println("Type:"+this.type);
        System.out.println("Origin:"+this.origin);
        System.out.println("Color:"+this.color);
        System.out.println("Flavor:"+this.flavor);
        System.out.println("Company:"+this.company);
    }
}