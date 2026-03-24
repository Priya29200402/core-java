class FarmerRunner{
    public static void main(String[] args){

        Farmer[] farmerInfos=new Farmer[10];
        FarmerStore farmerStore=new FarmerStore(farmerInfos);

        Farmer farmer1=new Farmer("Dayanand", 45, "SugarCane",15.5, true, "Belagavi");
        Farmer farmer2=new Farmer("Laxmi", 38, "Wheat",15, false, "Belagavi");
        Farmer farmer3=new Farmer("Kempavva",58, "Maize", 2.5, true, "Hubli");
        Farmer farmer4=new Farmer("Rajeev", 38, "Maize", 4.0, false, "Belgaum");
        Farmer farmer5=new Farmer("Lakkappa", 42, "Cotton", 6.0, true, "Raichur");
        Farmer farmer6=new Farmer("Pundaleek", 47, "Pulses", 3.2, false, "Bidar");
        Farmer farmer7=new Farmer("Manoj", 35, "Groundnut", 2.8, true, "Tumkur");
        Farmer farmer8=new Farmer("Shiva", 44, "Millets", 3.9, true, "Chitradurga");
        Farmer farmer9=new Farmer("Praveen", 39, "Vegetables", 2.0, false, "Kolar");
        Farmer farmer10=new Farmer("Sandeep", 48, "Fruits", 5.5, true, "Hassan");

        farmerStore.save(farmer1);
        farmerStore.save(farmer2);
        farmerStore.save(farmer3);
        farmerStore.save(farmer4);
        farmerStore.save(farmer5);
        farmerStore.save(farmer6);
        farmerStore.save(farmer7);
        farmerStore.save(farmer8);
        farmerStore.save(farmer9);
        farmerStore.save(farmer10);

        farmer1.printInfo();
		System.out.println("\n");
		
		farmer2.printInfo();
		System.out.println("\n");
		
		farmer3.printInfo();
		System.out.println("\n");
		
		farmer4.printInfo();
		System.out.println("\n");
		
		farmer5.printInfo();
		System.out.println("\n");
		
		farmer6.printInfo();
		System.out.println("\n");
		
		farmer7.printInfo();
		System.out.println("\n");
		
		farmer8.printInfo();
		System.out.println("\n");
		
		farmer9.printInfo();
		System.out.println("\n");
		
		farmer10.printInfo();
		System.out.println("\n");
		
    }
}