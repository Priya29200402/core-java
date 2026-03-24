class SambarRunner{
    public static void main(String[] args){

        Sambar[] sambarInfos=new Sambar[10];
        SambarStore sambarStore=new SambarStore(sambarInfos);

        Sambar sambar1=new Sambar("Vegetable", "Toor Dal", 1.5, true, 60, "South India");
        Sambar sambar2=new Sambar("Onion", "Onion", 1.0, true, 50, "Tamil Nadu");
        Sambar sambar3=new Sambar("Drumstick", "Drumstick", 1.2, true, 55, "Karnataka");
        Sambar sambar4=new Sambar("Mixed Veg", "Vegetables", 1.8, true, 65, "Kerala");
        Sambar sambar5=new Sambar("Tomato", "Tomato", 1.1, true, 45, "Andhra");
        Sambar sambar6=new Sambar("Hotel Style", "Dal", 2.0, true, 70, "Chennai");
        Sambar sambar7=new Sambar("Home Style", "Dal", 1.3, false, 50, "Bangalore");
        Sambar sambar8=new Sambar("Spicy", "Dal", 1.4, true, 60, "Hyderabad");
        Sambar sambar9=new Sambar("Less Spicy", "Dal", 1.2, false, 55, "Mysore");
        Sambar sambar10=new Sambar("Special", "Dal", 2.2, true, 80, "Udupi");

        sambarStore.save(sambar1);
        sambarStore.save(sambar2);
        sambarStore.save(sambar3);
        sambarStore.save(sambar4);
        sambarStore.save(sambar5);
        sambarStore.save(sambar6);
        sambarStore.save(sambar7);
        sambarStore.save(sambar8);
        sambarStore.save(sambar9);
        sambarStore.save(sambar10);

        sambar1.printInfo();
		System.out.println("\n");
		
		sambar2.printInfo();
		System.out.println("\n");
		
		sambar3.printInfo();
		System.out.println("\n");
		
		sambar4.printInfo();
		System.out.println("\n");
		
		sambar5.printInfo();
		System.out.println("\n");
		
		sambar6.printInfo();
		System.out.println("\n");
		
		sambar7.printInfo();
		System.out.println("\n");
		
		sambar8.printInfo();
		System.out.println("\n");
		
		sambar9.printInfo();
		System.out.println("\n");
		
		sambar10.printInfo();
		
    }
}