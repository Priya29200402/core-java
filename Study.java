class Study{
	
	
	static void timeTable(String day,int studyHours, int sleepTime){
		
		System.out.println("DAY:"+ day);
		System.out.println("STUDY HOURS:"+ studyHours);
		System.out.println("Sleep Time:"+sleepTime);
		System.out.println("=========================");
		
		if(day==null){
			
			System.out.println("Invalid Day");
			return;
		}
		
		if (studyHours==0){
		System.out.println("Invalid Hour");
		return;
		}
	}
		
		
	static void studyTracker(String name, boolean studeid, int studyHour){
		
		System.out.println("Name:"+ name);
		System.out.println("Stdied or not:"+ studeid);
		System.out.println("Studied Hour:"+ studyHour);
		System.out.println("=========================");
		
		if(name==null){
			
			System.out.println("Invalid name");
			return;
		}
		if (studyHour<0){
			
			System.out.println("Inavlid study hour");
			return;
		}
		
	
	}
}