class Bell{

    String type;
    int size;
    double weight;
    boolean ringing;
    int quantity;

    BellMaterial material;
    BellColor color;
    BellBrand brand;
    BellUsage usage;
    BellSound sound;

    Bell(String type,int size,double weight,boolean ringing,int quantity,
         BellMaterial material,BellColor color,BellBrand brand,BellUsage usage,BellSound sound){

        this.type=type;
        this.size=size;
        this.weight=weight;
        this.ringing=ringing;
        this.quantity=quantity;

        this.material=material;
        this.color=color;
        this.brand=brand;
        this.usage=usage;
        this.sound=sound;
    }

    void getBellDetails(){

        System.out.println("Type:"+this.type);
        System.out.println("Size:"+this.size);
        System.out.println("Weight:"+this.weight);
        System.out.println("Ringing:"+this.ringing);
        System.out.println("Quantity:"+this.quantity);

        System.out.println("Material:"+this.material);
        System.out.println("Color:"+this.color);
        System.out.println("Brand:"+this.brand);
        System.out.println("Usage:"+this.usage);
        System.out.println("Sound:"+this.sound);
    }
}