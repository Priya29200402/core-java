class Task8Runner{
	public static void main(String[] args){
		
		Members members1=new Members(550);
		District district1= District.BELAGAVI;
		Parliament parliament1=new Parliament("Karnataka",district1,members1);
		parliament1.printInfo();
		 
		System.out.println("\n");
		Members members2=new Members(224);
		District district2= District.PALNADU;
		Parliament parliament2=new Parliament("AndraPradesh",district2,members2);
		parliament2.printInfo();
		
		System.out.println("\n");
		Members members3=new Members(222);
		District district3= District.KOLHAPUR;
		Parliament parliament3=new Parliament("Maharastra",district3,members3);
		parliament3.printInfo();
		
		System.out.println("\n");
		Members members4=new Members(238);
		District district4= District.KASARGODU;
		Parliament parliament4=new Parliament("Kerala",district4,members4);
		parliament4.printInfo();
		
		System.out.println("\n =======Printing Court Details=======");
		CourtType courtType1=CourtType.CRIMINAL;
		CourtCases courtCases1=new CourtCases(700);
		Court court1=new Court("Karnataka",courtType1,courtCases1);
		court1.printInfo();
		
		System.out.println("\n");
		CourtType courtType2=CourtType.CIVIL;
		CourtCases courtCases2=new CourtCases(1500);
		Court court2=new Court("Andra Pradesh",courtType2,courtCases2);
		court2.printInfo();
		
		
		System.out.println("\n");
		CourtType courtType3=CourtType.FAMILY;
		CourtCases courtCases3=new CourtCases(1800);
		Court court3=new Court("Maharastra",courtType3,courtCases3);
		court3.printInfo();
		
		System.out.println("\n");
		CourtType courtType4=CourtType.CONSUMER;
		CourtCases courtCases4=new CourtCases(260);
		Court court4=new Court("Kerala",courtType4,courtCases4);
		court4.printInfo();
		
		
		
		
		
		
		
	}
}