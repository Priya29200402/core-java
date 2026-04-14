class Court{
	String state;
	CourtType courtType;
	CourtCases courtCases;
	
	Court(String state,CourtType courtType,CourtCases courtCases){
		this.state=state;
		this.courtType=courtType;
		this.courtCases=courtCases;
	}
	
	void printInfo(){
		System.out.println("State:"+this.state);
		System.out.println("Court Type:"+this.courtType);
		
		if(this.courtCases!=null){
			this.courtCases.getCount();
		}
		else{
			System.out.println("Cases cannot be null");
		}

	}
}