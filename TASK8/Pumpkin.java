class Pumpkin{
	Variety type;
	int price;
	PumpkinQuality quality;
	
	Pumpkin(Variety type, int price, PumpkinQuality quality){
		this.type=type;
		this.price=price;
		this.quality=quality;
	}
	void printInfo(){
		System.out.println("Pumpkin Type:"+this.type);
		System.out.println("Price:"+price);
		
		if(this.quality!=null){
			this.quality.getInfo();
		}
		else{
			System.out.println("Quality cannot be null");
		}
	}
	
}