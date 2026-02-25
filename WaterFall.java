class WaterFall{

    static void info(String name, int height, String state, boolean touristSpot){
		
	System.out.println("Falls Name:"+ name);
	System.out.println("Falls Height:"+ height);
	System.out.println("Is a touristSpot:"+ touristSpot);
	System.out.println("===============================");
	

        if (name == null){
            System.out.println("Invalid Waterfall Name");
			return;
        }

        if (height <= 0){
             System.out.println("Invalid Height");
			return; 
        }

        if (state == null){
            System.out.println("Invalid State");
			return; 
        }

        System.out.println("Waterfall Info Valid for: " + name);
    }

    static void stateOwningInfo(String fallName, String state, String country, int height, boolean natural) {
		
		System.out.println("Fall Name:"+fallName);
		System.out.println("State:"+ state);
		System.out.println("Country:"+country);
		System.out.println("Height:"+height);
		System.out.println("Is Natural:"+natural);
		System.out.println("===============================");

        if (fallName == null) {
            System.out.println("Invalid Fall Name");
			return;
        }

        if (state == null) {
            System.out.println("Invalid State");
			return;
        }

        if (country == null) {
            System.out.println("Invalid Country");
			return;
        }

        if (height <= 0) {
          System.out.println("Invalid Height");
		  return;
        }

        System.out.println("State Owning Info Valid for: " + fallName);
    }
}