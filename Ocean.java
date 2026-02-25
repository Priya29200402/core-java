class Ocean {

    static void oceanDetails(String name, int depth, double area, String location, boolean saltWater) {
		
		System.out.println("Ocean Name: " + name);
        System.out.println("Depth: " + depth);
        System.out.println("Area: " + area);
        System.out.println("Location: " + location);
        System.out.println("Salt Water: " + saltWater);
        System.out.println("===========================");
		

        if (name == null) {
            System.out.println("Invalid Ocean Name");
			return;
        }

        if (depth <= 0) {
            System.out.println("Invalid Depth");
			return;
        }

        if (area <= 0) {
           System.out.println( "Invalid Area");
		   return;
        }

        if (location == null) {
            System.out.println("Invalid Location");
			return;
        }

        System.out.println("Ocean Details are Valid for:"+name);
    }
}