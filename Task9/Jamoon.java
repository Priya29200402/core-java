class Jamoon{

	int[] sweetPrices;
	JamoonBrand[] sweetBrands;

	Jamoon(int[] sweetPrices,JamoonBrand[] sweetBrands){
		this.sweetPrices=sweetPrices;
		this.sweetBrands=sweetBrands;
	}

	void printInfo(){

		System.out.println("\n====== Jamoon Details ======");

		if(this.sweetPrices!=null){
			System.out.println("Prices length: "+this.sweetPrices.length);
			for(int price:this.sweetPrices){
				System.out.println("Jamoon price: "+price);
			}
		}

		if(this.sweetBrands!=null){
			System.out.println("Brands length: "+this.sweetBrands.length);
			for(JamoonBrand brand:this.sweetBrands){
				if(brand!=null){
					brand.getInfo();
				}
			}
		}
	}
}