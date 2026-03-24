class ProfileRunner{
    public static void main(String[] args){

        Profile[] profiles=new Profile[10];
        ProfileStore profileStore=new ProfileStore(profiles);

        Profile profile1=new Profile("Ashok", 30, "Software Developer", 87000.45, "Belagavi", 7.5);
        Profile profile2=new Profile("Ravi", 28, "Data Analyst", 65000.00, "Bangalore", 5.0);
        Profile profile3=new Profile("Suresh", 35, "Manager", 95000.75, "Mysore", 10.0);
        Profile profile4=new Profile("Anita", 27, "HR", 55000.25, "Hubli", 4.5);
        Profile profile5=new Profile("Kiran", 32, "Tester", 60000.00, "Belagavi", 6.0);
        Profile profile6=new Profile("Priya", 29, "UI Designer", 72000.90, "Tumkur", 5.5);
        Profile profile7=new Profile("Manoj", 40, "Project Lead", 105000.00, "Chitradurga", 12.0);
        Profile profile8=new Profile("Divya", 26, "Intern", 25000.00, "Kolar", 1.0);
        Profile profile9=new Profile("Naveen", 31, "DevOps Engineer", 80000.60, "Hassan", 7.0);
        Profile profile10=new Profile("Pooja", 33, "Business Analyst", 78000.30, "Raichur", 8.0);

        profileStore.save(profile1);
        profileStore.save(profile2);
        profileStore.save(profile3);
        profileStore.save(profile4);
        profileStore.save(profile5);
        profileStore.save(profile6);
        profileStore.save(profile7);
        profileStore.save(profile8);
        profileStore.save(profile9);
        profileStore.save(profile10);

        profile1.printInfo();
        System.out.println("\n");

        profile2.printInfo();
        System.out.println("\n");

        profile3.printInfo();
        System.out.println("\n");

        profile4.printInfo();
        System.out.println("\n");

        profile5.printInfo();
        System.out.println("\n");

        profile6.printInfo();
        System.out.println("\n");

        profile7.printInfo();
        System.out.println("\n");

        profile8.printInfo();
        System.out.println("\n");

        profile9.printInfo();
        System.out.println("\n");

        profile10.printInfo();
    }
}