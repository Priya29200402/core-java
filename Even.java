class Even{
	public static void main(String [] args){
		
		Numbers(11);
	}
	
	static void Numbers(int even){
		
		switch(even){
		
		case 1: System.out.println("2");
		break;
		
		case 2: System.out.println("4");
		break;
		
		case 3: System.out.println("6");
		break;
		
		case 4: System.out.println("8");
		break;
		
		case 5: System.out.println("10");
		break;
		
		default: System.out.println("Not a Even Number");
		break;
		}


		}
}