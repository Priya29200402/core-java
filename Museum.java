class Museum{
    String name;
    String location;
	
	Museum(){
		
		System.out.println("creating Constructor without arguments");
	}
	
	Museum(String name){
		this.name=name;
		System.out.println("Created Museum with string constructor");
	}
	
	Museum(String name,String location){
		this.name=name;
		this.location=location;
		System.out.println("created museum with string, string constructor");
	}
	
}