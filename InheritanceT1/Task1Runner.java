class Task1Runner{
	public static void main(String[] args){
		
		AjantaClock ajantaClock=new AjantaClock();
		System.out.println("Printing Clcok Information using Inheritance");
		
		ajantaClock.color="black";
		System.out.println("Color:"+ ajantaClock.color);
		
		ajantaClock.price=450;
		System.out.println("Price:"+ ajantaClock.price);
		
		ajantaClock.working=true;
		System.out.println("Working:"+ ajantaClock.working);
		
		ajantaClock.originCountry="India";
		System.out.println("origin Country:"+ ajantaClock.originCountry);
		
		ajantaClock.yearFounded=1971;
		System.out.println("year Founded:"+ ajantaClock.yearFounded);
		
		ajantaClock.founder="Odhavaji Raghavji Patel";
		System.out.println("Founder:"+ ajantaClock.founder);
		
		ajantaClock.website="shoporeva.com";
		System.out.println("website:"+ ajantaClock.website);
		
		ajantaClock.tradeName="Ajanta Manufacturing Private Limited";
		System.out.println("trade Name:"+ ajantaClock.tradeName);
		
		System.out.println("\n-----Methods-----");
		ajantaClock.getBrands();
		ajantaClock.saveTimings();
		ajantaClock.getProducts();
		
		AjantaClock ajantaClock1=new AjantaClock();
		System.out.println("Printing Clcok Information using Inheritance");
		
		ajantaClock1.color="black";
		System.out.println("Color:"+ ajantaClock1.color);
		
		ajantaClock1.price=450;
		System.out.println("Price:"+ ajantaClock1.price);
		
		ajantaClock1.working=true;
		System.out.println("Working:"+ ajantaClock1.working);
		
		ajantaClock1.originCountry="India";
		System.out.println("origin Country:"+ ajantaClock1.originCountry);
		
		ajantaClock1.yearFounded=1971;
		System.out.println("year Founded:"+ ajantaClock1.yearFounded);
		
		ajantaClock1.founder="Odhavaji Raghavji Patel";
		System.out.println("Founder:"+ ajantaClock1.founder);
		
		ajantaClock1.website="shoporeva.com";
		System.out.println("website:"+ ajantaClock1.website);
		
		ajantaClock1.tradeName="Ajanta Manufacturing Private Limited";
		System.out.println("trade Name:"+ ajantaClock1.tradeName);
		
		System.out.println("\n-----Methods-----");
		ajantaClock1.getBrands();
		ajantaClock1.saveTimings();
		ajantaClock1.getProducts();
		
		System.out.println("\n====================");
		
		Clock clock=new AjantaClock();
		clock.color="White";
		System.out.println("Color:"+ clock.color);
		
		clock.price=500;
		System.out.println("Price:"+ clock.price);
		
		clock.working=true;
		System.out.println("Working:"+ clock.working);
		
		clock.getBrands();
		clock.saveTimings();
		System.out.println("\n====================");
		
		Clock clock1=new AjantaClock();
		clock1.color="blue";
		System.out.println("Color:"+ clock1.color);
		
		clock1.price=387;
		System.out.println("Price:"+ clock1.price);
		
		clock1.working=false;
		System.out.println("Working:"+ clock1.working);
		
		clock1.getBrands();
		clock1.saveTimings();
		
		
		
		
		KalingaWar kalingaWar=new KalingaWar();
		
		kalingaWar.year="261 BCE";
		System.out.println("year:"+ kalingaWar.year);
		kalingaWar.king="Ashoka";
		System.out.println("King:"+kalingaWar.king);
		kalingaWar.winOrLoss=true;
		System.out.println("Win Or Loss:"+kalingaWar.winOrLoss);
	
		System.out.println("\n-----Methods-----");
		kalingaWar.getInfo();
		kalingaWar.printInfo();
		kalingaWar.detailsOfWar();
		
		KalingaWar kalingaWar1=new KalingaWar();
		
		kalingaWar1.year="268 BCE";
		System.out.println("year:"+ kalingaWar1.year);
		kalingaWar1.king="King Ashoka";
		System.out.println("King:"+kalingaWar1.king);
		kalingaWar1.winOrLoss=true;
		System.out.println("Win Or Loss:"+kalingaWar1.winOrLoss);
	
		System.out.println("\n-----Methods-----");
		kalingaWar1.getInfo();
		kalingaWar1.printInfo();
		kalingaWar1.detailsOfWar();
		
	}
	
}