class Kingdom {

    static void save(boolean king, String name, String kingdomName, String queenName,
                     String princessName, int populationOfKingdom, String territory,
                     int yearOfBirth, int yearOfDeath, int armySize, int yearsRuled) {
						 
					System.out.println("Is King : " + king);
					System.out.println("King Name : " + name);
					System.out.println("Kingdom Name : " + kingdomName);
					System.out.println("Queen Name : " + queenName);
					System.out.println("Princess Name : " + princessName);
					System.out.println("Population : " + populationOfKingdom);
					System.out.println("Territory : " + territory);
					System.out.println("Year of Birth : " + yearOfBirth);
					System.out.println("Year of Death : " + yearOfDeath);
					System.out.println("Army Size : " + armySize);
					System.out.println("Years Ruled : " + yearsRuled);
					System.out.println("Kingdom Data is valid");
					System.out.println("=================================");

        if (name == null) {
            System.out.println("Invalid King Name");
            return;
        }
        if (kingdomName == null) {
            System.out.println("Invalid Kingdom Name");
            return;
        }
        if (populationOfKingdom <= 0) {
            System.out.println("Invalid Population");
            return;
        }

        System.out.println("Kingdom Data is valid ");
        System.out.println("=================================");
    }

    static void saveArmy(int noOfSoldiers, int noOfElephants, int noOfHorses,
                         String type, int noOfWeapons, String commanderName,
                         boolean commanderMarried, String commanderWifeName,
                         boolean commanderIsFather, String commanderChildName,
                         int commanderExperience) {
						
						System.out.println("Soldiers : " + noOfSoldiers);
						System.out.println("Elephants : " + noOfElephants);
						System.out.println("Horses : " + noOfHorses);
						System.out.println("Army Type : " + type);
						System.out.println("Weapons : " + noOfWeapons);
						System.out.println("Commander : " + commanderName);
						System.out.println("Commander Married : " + commanderMarried);
						System.out.println("Commander Wife : " + commanderWifeName);
						System.out.println("Commander is Father : " + commanderIsFather);
						System.out.println("Commander Child : " + commanderChildName);
						System.out.println("Experience : " + commanderExperience);
						System.out.println("Army Data is valid");
						System.out.println("=================================");

        if (noOfSoldiers <= 0) {
            System.out.println("Invalid Soldiers");
            return;
        }
        if (commanderName == null) {
            System.out.println("Invalid Commander Name");
            return;
        }

        System.out.println("Army Data is valid ");
        System.out.println("=================================");
    }
}