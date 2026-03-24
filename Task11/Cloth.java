class Cloth{
	String name;
	String brand;
	double price;
	String material;
	char size;
	boolean onlineAvailable;
	
	Cloth(String name, String brand, double price, String material, char size, boolean onlineAvailable){
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.material=material;
		this.size=size;
		this.onlineAvailable=onlineAvailable;
	}
	
	void printInfo(){
		System.out.println("Executing Cloth Information");
		System.out.println("Name:"+this.name);
		System.out.println("Brand:"+this.brand);
		System.out.println("Price:"+this.price);
		System.out.println("Material:"+this.material);
		System.out.println("size:"+this.size);
		System.out.println("Online Available:"+this.onlineAvailable);
	}
}