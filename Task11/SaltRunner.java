class SaltRunner{
    public static void main(String[] args){

        Salt[] saltInfos=new Salt[10];
        SaltStore saltStore=new SaltStore(saltInfos);

        Salt salt1=new Salt("Table Salt", "Tata", 20, 1, true, "India");
        Salt salt2=new Salt("Rock Salt", "Local", 15, 0.5, false, "Himalaya");
        Salt salt3=new Salt("Sea Salt", "Catch", 25, 1, true, "Goa");
        Salt salt4=new Salt("Black Salt", "Patanjali", 30, 0.5, false, "India");
        Salt salt5=new Salt("Kosher Salt", "Imported", 50, 1, false, "USA");
        Salt salt6=new Salt("Pink Salt", "Himalayan", 60, 1, true, "Pakistan");
        Salt salt7=new Salt("Flavored Salt", "Urban", 40, 0.5, true, "India");
        Salt salt8=new Salt("Low Sodium", "Health", 35, 1, true, "India");
        Salt salt9=new Salt("Iodized Salt", "Aashirvaad", 22, 1, true, "India");
        Salt salt10=new Salt("Organic Salt", "Organic", 55, 1, false, "India");

        saltStore.save(salt1);
        saltStore.save(salt2);
        saltStore.save(salt3);
        saltStore.save(salt4);
        saltStore.save(salt5);
        saltStore.save(salt6);
        saltStore.save(salt7);
        saltStore.save(salt8);
        saltStore.save(salt9);
        saltStore.save(salt10);

        salt1.printInfo();
		System.out.println("\n");
		
		salt2.printInfo();
		System.out.println("\n");
		
		salt3.printInfo();
		System.out.println("\n");
		
		salt4.printInfo();
		System.out.println("\n");
		
		salt5.printInfo();
		System.out.println("\n");
		
		salt6.printInfo();
		System.out.println("\n");
		
		salt7.printInfo();
		System.out.println("\n");
		
		salt8.printInfo();
		System.out.println("\n");
		
		salt9.printInfo();
		System.out.println("\n");
		
		salt10.printInfo();
		System.out.println("\n");
    }
}