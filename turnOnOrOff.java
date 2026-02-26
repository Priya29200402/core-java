class FMradio{
	
	static void setFrequency(float frequency){
		
		System.out.println("frequency:"+frequency)
		
		if(frequency>=88.0 || frequency<108.0){
			
			
			System.out.println("Valid frequency");
		}
		else{
			
			System.out.println("Invalid frequency");
		}
	}
}