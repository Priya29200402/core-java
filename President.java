class President{
	static void govern(){
		System.out.println("President governs the country");
		callState();
	}
	
	static void callState(){
		System.out.println("Call the state");
		rules();
	}
	
	static void rules(){
		System.out.println("Making the rules");
		check();
	}
	
	static void check(){
		System.out.println("Checking rules are following or not");
		collect();
	}
	
	static void collect(){
		System.out.println("Collecting the reports of states");
		chain();
	}
	
	static void chain(){
		System.out.println("Maintaining the chain of command");
		citizen();
	}
	
	static void citizen(){
		System.out.println("Sovling the citizens problems");
		follow();
	}
	
	static void follow(){
		System.out.println("Citizens follows the rules");
	
	}
}
