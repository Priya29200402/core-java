class Names{
	public static void main(String[] args){
		
		itemName("Laptop");
	}
	
	static void itemName(String itemName){
	
	switch(itemName){
		
		case "Laptop": System.out.println("Item name is Laptop");
		break;
		
		case "Fan": System.out.println("Item name is Fan");
		break;
		
		case "Charger": System.out.println("Item name is Charger");
		break;
		
		case "Slipper": System.out.println("Item name is Slipper");
		break;
		
		case "Stand": System.out.println("Item name is Stand");
		break;
		
		default: System.out.println("There is no Item");

		}
	}

}