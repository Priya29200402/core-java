class CricketWorldCup{
	
	static void registerTeam(String teamName, String captainName, int ranking, boolean isHost, int squadSize){
		
		System.out.println("Team Name:"+ teamName);
		System.out.println("Captain:"+ captainName);
		System.out.println("Ranking:"+ ranking);
		System.out.println("Is Host:"+ isHost);
		System.out.println("Squad size:"+squadSize );
		
		if (teamName==null){
			
			System.out.println("Invalid name");
			return;

		}
		
		if (ranking<0){
			
			System.out.println("Invalid rank");
			return;
		}
		
		System.out.println("valid Data for team:"+teamName);
	}
	
	static void saveMatch(String matchId, String team1,String team2,String venue, String city, String date, double time, int overs, boolean isDayNight, String umpire1, String umpire2){
		
		System.out.println("match Id:"+ matchId);
		System.out.println("Team 1:"+ team1);
		System.out.println("Team2:"+ team2);
		System.out.println("Venue:"+ venue);
		System.out.println("City:"+ city);
		System.out.println("Date:"+ date);
		System.out.println("Time:"+ time);
		System.out.println("Overs:"+ overs);
		System.out.println("Is DAYNIght:"+ isDayNight);
		System.out.println("Umpire1:"+ umpire1);
		System.out.println("Umpire2:"+ umpire2);
		System.out.println("=========================");
		
		if(matchId==null){
			
			System.out.println("Inavlid ID");
			return;
		}
		if (time==0){
			
			System.out.println("Invalid Time");
			return;
		}
		if (overs<=0){
			System.out.println("Invalid Overs");
			return;
		}
		
		System.out.println("Valid match Deatils for :"+ matchId);
		
		
		
	}
	
	static void savePlayer(String palyerName, int jerseyNumber, String role, boolean isCaptain, boolean isViceCaptain, int matchesPlayed, int runScored, int wicketTaken, double battingAverage, double bowlingEconomy){
		System.out.println("Player Name:"+palyerName);
		System.out.println("jerseyNumber:"+jerseyNumber);
		System.out.println("Role:"+role);
		System.out.println("Captain or Not:"+isCaptain);
		System.out.println("Is Vice Captain:"+isViceCaptain);
		System.out.println("No of Matches Played:"+matchesPlayed);
		System.out.println("Run Scored:"+runScored);
        System.out.println("Wicket Taken:"+wicketTaken);		
        System.out.println("Average of batting :"+battingAverage);	
        System.out.println("Economy  of  bowling :"+ bowlingEconomy);	
		
		
		if(palyerName==null){
			
			System.out.println("Invalid Name");
			
			return;
		}
		if(matchesPlayed<=0){
			
			System.out.println("Invalid Mathes");
			return;
			
		}
		
		if(battingAverage<0){
			
			System.out.println("Inavlid batting average");
			return;
			
		}
		
		System.out.println("Valid Inforamtion about player:"+palyerName);

		
	}
	
	static void calculateRunRate(int totalRuns, int overFaced, int wicketLost){
		
		System.out.println("Total Runs:"+totalRuns);
		System.out.println("Over faced:"+overFaced);
		System.out.println("Wicket Lost:"+wicketLost);
		
		if (totalRuns<90){
		
		System.out.println("Very Least score");
		return;
		}
		if (overFaced==0){
			
			System.out.println("Invalid Overs");
			return;
		}
		if (wicketLost>10){
			
			System.out.println("Invalid wickets");
			return;
		}
		
		System.out.println("Valid Infromation about Score Board");
	}
	
	static void checkQualification(int points,double netRunRate, int matchesLeft){
			
			System.out.println("earned points:"+points );
			System.out.println("Net RunRate:"+netRunRate );
			System.out.println("remaining Matches:"+matchesLeft );
			
			if(points==0){
				
				System.out.println("Inavlid Points");
				return;	
			}
			
			if (netRunRate==0){
				
				System.out.println("Inavlid netRunRate");
				return;
				
			}
			
			if(matchesLeft==0){
				
				System.out.println("Inavalid matches left");
				return;
			}				
			
		}
		
		static void manOfTheMatch(String palyerName,int runs, int wickets){
			
			System.out.println("Player Name:"+palyerName);
			System.out.println("runs Scored:"+runs);
			System.out.println("wickets Taken:"+wickets);
			
			if(palyerName==null){
				
				System.out.println("Inavlid Player name");
				return;
			}
			if (runs==0){
				System.out.println("Inavlid runs");
				return;
				
			}
			
			if (wickets==0){
				System.out.println("Inavlid wickets");
				return;
			}
		}

	
	
}