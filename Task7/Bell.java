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

        if(this.material!=null){
			this.material.getData();
		}
		else{
			System.out.println("Material is null");
		}
		if(this.color!=null){
			this.color.getData();
		}
		else{
			System.out.println("Color is null");
		}
		if(this.brand!=null){
			this.brand.getData();
		}
		else{
			System.out.println("brand is null");
		}
		if(this.usage!=null){
			this.usage.getData();
		}
		else{
			System.out.println("usage is null");
		}
		if(this.sound!=null){
			this.sound.getData();
		}
		else{
			System.out.println("sound is null");
		}
    }
}