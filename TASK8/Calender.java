class Calendar{
	CalendarCompany company;
	LeapYear leapYear;
	int price;
	
	Calendar(CalendarCompany company, LeapYear leapYear, int price){
		this. company=company;
		this. leapYear=leapYear;
		this.price=price;
	}
	void printInfo(){
		System.out.println("calendar company:"+this.company);
		if(this.leapYear!=null){
			this.leapYear.getInfo();
		}
		else{
			System.out.println("leapYear cannot be null");
		}
		System.out.println("Price:"+this.price);	
	}
      
	  
}