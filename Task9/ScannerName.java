class ScannerName{
	String brand;
	double price;
	
	ScannerName(String brand,double price){
		this.brand=brand;
		this.price=price;
	}
	void getInfo(){
		System.out.println("Scanner Brand:"+this.brand);
		System.out.println("Scanner Price:"+this.price);
	}
}