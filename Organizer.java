class Organizer{
	
	static void storeItem(String type, int quantity){
		
		System.out.println("Item Type:"+ type);
		System.out.println("Item Quantity:"+ quantity);
		System.out.println("========================");
	}
		
		
	static void storeItem(int quantity, String type){
		System.out.println("Item Quantity:"+ quantity);
		System.out.println("Item Type:"+ type);
		System.out.println("========================");
	}
		
	static void storeItem(boolean isCloth, String name, int quantity){
		System.out.println("Is a Cloth:"+ isCloth);
		System.out.println("Name of the Cloth:"+ name);
		System.out.println("Item Quantity:"+ quantity);
		System.out.println("========================");
	}
		
}