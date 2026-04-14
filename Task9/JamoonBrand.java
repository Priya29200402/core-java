class JamoonBrand{

	String sweetBrand;
	int sweetPrice;

	JamoonBrand(String sweetBrand,int sweetPrice){
		this.sweetBrand=sweetBrand;
		this.sweetPrice=sweetPrice;
	}

	void getInfo(){
		System.out.println("Jamoon Brand: "+this.sweetBrand);
		System.out.println("Jamoon Price: "+this.sweetPrice);
	}
}