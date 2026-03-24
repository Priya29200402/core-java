class Festival{
	String name;
	String date;
	String religion;
	boolean governmentHoliday;
	int days;
	boolean pollution;
	
	Festival(String name, String date, String religion, boolean governmentHoliday,
	          int days, boolean pollution){
			this.name=name;
			this.date=date;
			this.religion=religion;
			this.governmentHoliday=governmentHoliday;
			this.days=days;
			this.pollution=pollution;
	}
	void printInfo(){
		System.out.println("Executing Festival Information");
		System.out.println("Name:"+this.name);
		System.out.println("Date:"+this.date);
		System.out.println("religion:"+this.religion);
		System.out.println("governmentHoliday:"+this.governmentHoliday);
		System.out.println("Number Of Days:"+this.days);
		System.out.println("Pollution:"+this.pollution);
	}
	
}