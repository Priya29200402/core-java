class Biscuit{
	
	static String getShape(String name){
		
		System.out.println("Name:"+name);
		
		if(name==null){
			System.out.println("Invalid name");
			return null;
		}
		if (name=="Parle-G"){
			return "Rectangle";
		}
	return null;	
	} 
	
	static int getCost(String name){
		System.out.println("Name:"+name);
		
		if(name==null){
			System.out.println("Invalid name");
			return 0;
		}
		if (name=="Oreo"){
			return 10;
		}
		return 0;
	}
	
	static String getFlavour(String[] flavours){
		
		return null;
	}
	
	
}