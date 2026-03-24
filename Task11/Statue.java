class Statue{
	String name;
	String place;
	double height;
	boolean historic;
	boolean touristPlace;
	String builder;
	
	Statue(String name, String place, double height, boolean historic, boolean touristPlace, String builder){
		this.name=name;
		this.place=place;
		this.height=height;
		this.historic=historic;
		this.touristPlace=touristPlace;
		this.builder=builder;
	}
	
	void printInfo(){
		System.out.println("Executing Statue Information...");
		System.out.println("name:"+this.name);
		System.out.println("place:"+this.place);
		System.out.println("height:"+this.height);
		System.out.println("historic:"+this.historic);
		System.out.println("touristPlace:"+this.touristPlace);
		System.out.println("builder:"+this.builder);
	
	}
}