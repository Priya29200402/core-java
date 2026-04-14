class Dmart{
	String location;
	ItemName itemName;
	ItemQuantity itemQuantity;
	
	Dmart(String location, ItemName itemName, ItemQuantity itemQuantity){
		this.location=location;
		this.itemName=itemName;
		this.itemQuantity=itemQuantity;
	}
	void printInfo(){
		System.out.println("Dmart Location:"+this.location);
		System.out.println("Item Name:"+this.itemName);
		
		if(this.itemQuantity!=null){
			this.itemQuantity.getQuantity();
		}
		else{
			System.out.println("Item quantity cannot be null");
		}
	}
}