class CricketWorldCupRunner{
	
	public static void main(String [] args){
		System.out.println("Team Information");
		
		CricketWorldCup.registerTeam("India","Suryakumar yadav",5,true,12);
		CricketWorldCup.registerTeam("South africa","ABD viilers",6,false,12);
		CricketWorldCup.registerTeam("England","Willeam",4,true,12);
		
		
		
		CricketWorldCup.saveMatch("123A","India","South africa","Abudabi stadium","dubai","29\12\2025",2.5,50,true,"Ashok","Revant");
		CricketWorldCup.saveMatch("123SD","India","England","Chinnaswami Stadium","banglore","12\5\2025",3.0,20,true,"Raghav","Prem");
		
		CricketWorldCup.savePlayer("Virat",18,"BatsMan",true,false,8,98,2,78.23,10.0);
		CricketWorldCup.savePlayer("Rohit",45,"BatsMan",true,false,8,99,2,89.23,10.0);
		
		CricketWorldCup.calculateRunRate(230,20,6);
		CricketWorldCup.calculateRunRate(240,20,8);
		
		CricketWorldCup.checkQualification(12,12.2,3);
		CricketWorldCup.checkQualification(13,14.5,2);
		
		
		
		
		
		
	
	}
}