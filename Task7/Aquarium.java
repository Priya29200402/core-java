class Aquarium{

    String name;
    int fishes;
    double price;
    boolean filter;
    int size;

    AquariumType type;
    AquariumMaterial material;
    AquariumColor color;
    AquariumBrand brand;
    AquariumLight light;

    Aquarium(String name,int fishes,double price,boolean filter,int size,
             AquariumType type,AquariumMaterial material,AquariumColor color,
             AquariumBrand brand,AquariumLight light){

        this.name=name;
        this.fishes=fishes;
        this.price=price;
        this.filter=filter;
        this.size=size;

        this.type=type;
        this.material=material;
        this.color=color;
        this.brand=brand;
        this.light=light;
    }

    void getAquariumDetails(){

        System.out.println("Name:"+this.name);
        System.out.println("Fishes:"+this.fishes);
        System.out.println("Price:"+this.price);
        System.out.println("Filter:"+this.filter);
        System.out.println("Size:"+this.size);

        if(this.type!=null){
			this.type.getInfo();
		}
		else{
			System.out.println("Type is Null");
		}
		if(this.material!=null){
			this.material.getInfo();
		}
		else{
			System.out.println("Material is Null");
		}
		if(this.color!=null){
			this.color.getInfo();
		}
		else{
			System.out.println("color is Null");
		}
		if(this.brand!=null){
			this.brand.getInfo();
		}
		else{
			System.out.println("brand is Null");
		}
		if(this.light!=null){
			this.light.getInfo();
		}
		else{
			System.out.println("light is null");
			
		}
    }
}