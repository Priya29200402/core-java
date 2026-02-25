class OrganizerRunner{
	
	public static void main(String[] things){
		System.out.println("Storing Items Inside The Organizer");
		
		Organizer.storeItem("Earing",10);
		
		Organizer.storeItem(50,"Accessories");
		
		Organizer.storeItem(true,"Shirts", 8);
	}
}