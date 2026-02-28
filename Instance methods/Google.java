class Google{
    String name;
    String founder;
    int foundedYear;
    String ceo;
    String headquarters;
    int employees;
    double revenue;
    double profit;
    String product1;
    String product2;
    String product3;
    String service1;
    String service2;
    boolean publicCompany;
    String stockSymbol;
    String country;
    int offices;
    String parentCompany;
    String website;
    String email;

    Google(String name, String founder, int foundedYear, String ceo, String headquarters,
           int employees, double revenue, double profit, String product1, String product2,
           String product3, String service1, String service2, boolean publicCompany,
           String stockSymbol, String country, int offices, String parentCompany,
           String website, String email){

        this.name = name;
        this.founder = founder;
        this.foundedYear = foundedYear;
        this.ceo = ceo;
        this.headquarters = headquarters;
        this.employees = employees;
        this.revenue = revenue;
        this.profit = profit;
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;
        this.service1 = service1;
        this.service2 = service2;
        this.publicCompany = publicCompany;
        this.stockSymbol = stockSymbol;
        this.country = country;
        this.offices = offices;
        this.parentCompany = parentCompany;
        this.website = website;
        this.email = email;
    }
	
	void getData(){
		
		System.out.println("Name:"+name);
		System.out.println("Founder:"+founder);
		System.out.println("Founded Year:"+foundedYear);
		System.out.println("CEO:"+ceo);
		System.out.println("Head Quarters:"+headquarters);
		System.out.println("Number of Employees:"+employees);
		System.out.println("Revenue:"+revenue);
		System.out.println("Profit:"+profit);
		System.out.println("Product1:"+product1);
		System.out.println("Product2:"+product2);
		System.out.println("Product3:"+product3);
		System.out.println("Service1:"+service1);
		System.out.println("Service2:"+service2);
		System.out.println("PublicCompany:"+publicCompany);
		System.out.println("StockSymbol:"+publicCompany);
		System.out.println("Country:"+country);
		System.out.println("Offices:"+offices);
		System.out.println("ParentCompany:"+parentCompany);
		System.out.println("Website:"+website);
		System.out.println("Email:"+email);
		
		
	}
	
	

}