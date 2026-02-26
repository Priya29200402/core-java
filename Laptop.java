class Laptop{
	
	public static void main(String [] args){
		
		
		getLaptopBrand("HP");
	}
	
	static void getLaptopBrand(String name){
		
	switch(name){
		
		
		case "HP": System.out.println("HP Company");
		break;
		
		case "Lenova": System.out.println("Lenova Company");
		break;
		
		case "Dell": System.out.println("Dell company");
		break;
		
		case "Asus book": System.out.println("Asus company");
		break;
		
		case "Samsung": System.out.println("Samsung company");
		break;
		
		default: System.out.println("Not found");
		break;
	}
	}
}