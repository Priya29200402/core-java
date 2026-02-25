class Bird{
	
	static String  getColorByName(String name){
		
		System.out.println("Name of the bird:"+name);
		
		if(name==null){
			
			System.out.println("Name cannot be null");
			return null;
		}
		
		if (name=="Peacock"){
			
			return "Blue and Green";
		}                                                               
		
		if (name=="Parrot"){
			
			return "Green";
		}
		
		if(name=="Crow"){
			
			return "Black";
			
		}
		
		if(name=="Sparrow"){
			
			return "Brown";
		}
		
		if(name=="Pigeon"){
			
			return "Grey";
		}
		if(name=="Flamingo"){
			
			return "Pink";
		}
		
		if(name=="Swan"){
			
			return "White";
		}
		if(name=="Eagle"){
			
			return "Dark Brown";
		}
		
		if(name=="Myna"){
			return "Brown";
		}
		
		if(name=="Koel"){
			
			return"Black";
			
		}
		
		if(name=="Indian peafowl"){
			
			return"Bright Blue";
		}
		
		if(name=="Bulbul"){
			return "Brown";
			
		}
		if(name=="Robin"){
			
			return"Black and White";
		}
		if(name=="Owl"){
			return "Golden brown";
		}
		
		if(name=="Dove"){
			return"Black and white"
		}
		
		if(name=="Indian Roller"){
			return "Bright blue";
		}
		
		if(name=="Black kite"){
			
			return "Dark brown";
		}
		
		if(name=="Baya Weaver"){
			return "Yellow"
		}
		
		if(name=="Bee eater"){
			return "Bright Green";
		}
		
		if(name=="Indian Robbin"){
			return "Dark brown";
		}
		if(name=="sunbird"){
			return "Purple";
		}
		
		System.out.println("Name is not matching with Database");
		return null;
	}
}