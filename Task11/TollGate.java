class TollGate{
	String name;
	double distance;
	double price;
	int numberOfGate;
	int numberOfEmployees;
	int numberOfVehicles;
	
	TollGate(String name, double distance, double price, int numberOfGate, int numberOfEmployees, int numberOfVehicles){
		this.name=name;
		this.distance=distance;
		this.price=price;
		this.numberOfGate=numberOfGate;
		this.numberOfEmployees=numberOfEmployees;
		this.numberOfVehicles=numberOfVehicles;
	}
	
	void printInfo(){
		System.out.println("Executing TollGate Information...");
		System.out.println("name:"+this.name);
		System.out.println("Distance:"+this.distance);
		System.out.println("Price:"+this.price);
		System.out.println("numberOfGate:"+this.numberOfGate);
		System.out.println("numberOfEmployees:"+this.numberOfEmployees);
		System.out.println("numberOfVehicles:"+this.numberOfVehicles);
		
	}
	
}