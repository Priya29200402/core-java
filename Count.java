class Count{
	
	public static void main(String[] args){
		countChair(9);
		
	}
	
	static void countChair(byte count){
		
		switch(count){
			
			case  127: System.out.println("There are 127 chairs present");
			break;
			
			case  57: System.out.println("There are 57 chairs");
			break;
			
			case  89: System.out.println("There are 89 chairs");
			break;
			
			case  128: System.out.println("There are 128 chairs");
			break;
			
			case  155: System.out.println("There are 155 chairs");
			break;
			
			default: System.out.println("There are 1000+ chairs ");
			break;
		}
	}
}