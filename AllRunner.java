class AllRunner{
	
	
	public static void main(String[]args){
		
		
		Bun bun=new Bun();
		bun.name="Sweet Bun";
		bun.price=15.5;
		bun.brand = "Britannia";
		bun.flavor = "Vanilla";
		bun.weight = 60.0;
		bun.color = "Golden Brown";
		bun.shape = "Round";
		bun.quantity = 10;
		bun.fresh = true;
		bun.expiryDate = "25-02-2026";
		bun.String[] ingredients = {"Flour", "Milk"};
        bun.String[] availableCities = {"Bangalore", "Mysore"};
		
		System.out.println("Bun Name:"+bun.name);
		System.out.println("Price:"+bun.price);
		System.out.println("Brand:"+bun.brand);
		System.out.println("Flavor:"+bun.flavor);
		System.out.println("Weight:"+bun.weight);
		System.out.println("Color:"+bun.color);
		System.out.println("Shape:"+bun.shape);
		System.out.println("quantity:"+bun.quantity);
		System.out.println("Fresh :"+bun.fresh);
		System.out.println("Expiry Date :"+bun.expiryDate);
		
		for(int indext=0;index<ingredients.length;index++){
			
			System.out.println("Ingredients:"+ingredients[index]);
		}
		
		for(int i=0;i<availableCities.length;i++){
			System.out.println("availableCities:"+availableCities[i]);
			
		}
		
	}
}