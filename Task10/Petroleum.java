class Petroleum{
	String[] companies;
	int index=0;
	
	Petroleum(String[] companies){
		this.companies=companies;
	}
	
	void save(String company){
		System.out.println("Executing save in petroleum");
		System.out.println("Comapany Name:"+company);
		if(this.companies!=null){
			System.out.println("Checking to store company");
			int companiesIndex=this.companies.length-1;
			if(this.index<=companiesIndex){
				System.out.println("storing comapny in index :"+this.index);
				this.companies[this.index]=company;
				this.index++;
				System.out.println("Stored the company name,next index to store next comapny:"+this.index);
				
			}
			else{
				System.out.println("Array is full you cannot store more companies");
			}
		}
		else{
		System.out.println("companies is not initilized with array");
	}
}
}