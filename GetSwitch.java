class CountBook{
	
	public static void main(String[] args){
		
		getNumberOFBooks(345);
	}
	
	static void getNumberOFBooks(int countBook){
		
		switch(countBook){
			
			case 121: System.out.println("There are 121 books ");
			break;
			
			case 242: System.out.println("There are 242 books ");
			break;
			
			case 322: System.out.println("There are 322 books");
			break;
			
			case 454: System.out.println("There are 454 books");
			break;
			
			case 345: System.out.println("There are 345 books");
			break;
			
			default : System.out.println("More Than 3000000 books are ther in library");
			break;
		}
	}
}