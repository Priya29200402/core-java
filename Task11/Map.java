class Map{
	String currentLocation;
	String desinationLocation;
	double distance;
	String vehicle;
	boolean publicTransportavailable;
	double petrolRequired;
	
	Map(String currentLocation, String desinationLocation, double distance, String vehicle, 
	    boolean publicTransportavailable, double petrolRequired){
			
			this.currentLocation=currentLocation;
			this.desinationLocation=desinationLocation;
			this.distance=distance;
			this.vehicle=vehicle;
			this.publicTransportavailable=publicTransportavailable;
			this.petrolRequired=petrolRequired;	
		}
	void printInfo(){
		System.out.println("Executing Map Information");
		System.out.println("CurrentLocation:"+this.currentLocation);
		System.out.println("Destination Location:"+this.desinationLocation);
		System.out.println("Distance:"+this.distance);
		System.out.println("Vehicle:"+this.vehicle);
		System.out.println("Public Transport Available:"+this.publicTransportavailable);
		System.out.println("Petrol Required:"+this.petrolRequired);
	}


}