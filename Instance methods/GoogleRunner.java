class GoogleRunner{
	public static void main(String[] values){
		
		System.out.println("INFORMATION ABOUT GOOGLE");
		
		Google google = new Google("Google", "Larry Page", 1998, "Sundar Pichai","California", 150000, 280.0, 60.0,
                                   "Search", "Gmail", "YouTube","Cloud", "Ads", true,"GOOGL", "USA", 70,
                                   "Alphabet", "www.google.com", "info@google.com");
		google.getData();
		System.out.println("===================");
		
		 Google google1 = new Google("Google India", "Larry Page", 2004, "Sanjay Gupta","Hyderabad", 20000, 50.0, 10.0,
                                      "Search", "Maps", "YouTube","Cloud", "Ads", true,"GOOGL", "India", 5,
                                       "Alphabet", "www.google.co.in", "india@google.com");
		google1.getData();
		System.out.println("===================");

        Google google2 = new Google("Google UK", "Larry Page", 2002, "Debbie Weinstein","London", 10000, 40.0, 8.0,
                                    "Search", "Android", "YouTube","Cloud", "Ads", true,"GOOGL", "UK", 3,
                                    "Alphabet", "www.google.co.uk", "uk@google.com");
		google2.getData();
		System.out.println("===================");

        Google google3 = new Google("Google Canada", "Larry Page", 2001, "Sabrina Geremia","Toronto", 8000, 30.0, 6.0,
                                    "Search", "Chrome", "Gmail","Cloud", "Ads", true,"GOOGL", "Canada", 2,
                                    "Alphabet", "www.google.ca", "canada@google.com");
        google3.getData();
		System.out.println("===================");
		
        Google google4 = new Google("Google Australia", "Larry Page", 2002, "Mel Silva","Sydney", 5000, 20.0, 4.0,
                                    "Search", "Maps", "Drive","Cloud", "Ads", true,"GOOGL", "Australia", 2,
                                    "Alphabet", "www.google.com.au", "aus@google.com");
		google4.getData();
		System.out.println("===================");

        Google google5 = new Google("Google Japan", "Larry Page", 2001, "Shinichi Kinoshita","Tokyo", 7000, 25.0, 5.0,
                               "Search", "Translate", "YouTube","Cloud", "Ads", true,"GOOGL", "Japan", 3,
                               "Alphabet", "www.google.co.jp", "japan@google.com");
		google5.getData();
		System.out.println("===================");

        Google google6 = new Google("Google Germany", "Larry Page", 2001, "Philipp Justus","Berlin", 6000, 22.0, 4.5,
		                            "Search", "Chrome", "Android","Cloud", "Ads", true,"GOOGL", "Germany", 3,
                                    "Alphabet", "www.google.de", "germany@google.com");
		google6.getData();
		System.out.println("===================");

        Google google7 = new Google("Google France", "Larry Page", 2000, "Sebastien Missoffe","Paris", 4000, 18.0, 3.5,
                                    "Search", "Maps", "YouTube","Cloud", "Ads", true,"GOOGL", "France", 2,
                                    "Alphabet", "www.google.fr", "france@google.com");
	    google7.getData();
		System.out.println("===================");


        Google google8 = new Google("Google Singapore", "Larry Page", 2007, "Ben King","Singapore", 3000, 15.0, 3.0,
                               "Search", "Cloud", "Ads","Cloud", "Ads", true,"GOOGL", "Singapore", 2,
                               "Alphabet", "www.google.com.sg", "sg@google.com");
		google8.getData();
		System.out.println("===================");

        Google google9 = new Google("Google Brazil", "Larry Page", 2005, "Fabio Coelho","Sao Paulo", 3500, 16.0, 3.2,
                                    "Search", "YouTube", "Android","Cloud", "Ads", true,"GOOGL", "Brazil", 2,
                                    "Alphabet", "www.google.com.br", "brazil@google.com");
				
		google9.getData();
		System.out.println("===================");
				
	}
}