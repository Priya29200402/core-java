class CarrotHalwa{

	String[] halwaIngredients;
	CarrotHalwaBrand[] halwaBrands;

	CarrotHalwa(String[] halwaIngredients,CarrotHalwaBrand[] halwaBrands){
		this.halwaIngredients=halwaIngredients;
		this.halwaBrands=halwaBrands;
	}

	void printInfo(){

		System.out.println("\n====== Carrot Halwa Details ======");

		if(this.halwaIngredients!=null){
			System.out.println("Ingredients length: "+this.halwaIngredients.length);
			for(String ingredient:this.halwaIngredients){
				System.out.println("Ingredient: "+ingredient);
			}
		}

		if(this.halwaBrands!=null){
			System.out.println("Brands length: "+this.halwaBrands.length);
			for(CarrotHalwaBrand brand:this.halwaBrands){
				if(brand!=null){
					brand.getInfo();
				}
			}
		}
	}
}