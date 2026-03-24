class Cap{
	String brand;
	char size;
	String color;
	double price;
	boolean waterProof;
	String material;
	
	Cap(String brand, char size, String color, double price, boolean waterProof, String material){
		this.brand=brand;
		this.size=size;
		this.color=color;
		this.price=price;
		this.waterProof=waterProof;
		this.material=material;
	}
	
	void printInfo(){
		System.out.println("Executing Cap Information");
		System.out.println("Brand:"+this.brand);
		System.out.println("Size:"+this.size);
		System.out.println("color:"+this.color);
		System.out.println("price:"+this.price);
		System.out.println("waterProof:"+this.waterProof);
		System.out.println("Material:"+this.material);
	}
	
}