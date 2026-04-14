class HammerBrand{
	String brand;
	int price;
	
	HammerBrand(String brand, int price){
		this.brand=brand;
		this.price=price;
	}
	void getInfo(){
		System.out.println("Hammer Brand:"+this.brand);
		System.out.println("Hammer Price"+this.price);
		
	}
}