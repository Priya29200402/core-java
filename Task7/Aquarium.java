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

        System.out.println("Type:"+this.type);
        System.out.println("Material:"+this.material);
        System.out.println("Color:"+this.color);
        System.out.println("Brand:"+this.brand);
        System.out.println("Light:"+this.light);
    }
}