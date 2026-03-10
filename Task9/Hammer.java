class Hammer{
	int[] prices;
	HammerBrand[] brands;
	
	Hammer(int[] prices,HammerBrand[] brands){
		this.prices=prices;
		this.brands=brands;
	}
	void printInfo(){
		System.out.println("\n========Hammer Details========");
		if(this.prices!=null){
			System.out.println("Prices length:"+this.prices.length);
			for(int price:prices){
				System.out.println("Hammer price:"+price);
			}
		}
			if(this.brands!=null){
				System.out.println("Brand length:"+this.brands.length);
				for(HammerBrand brand:this.brands){
					brand.getInfo();
				}
			}
			
	}
}