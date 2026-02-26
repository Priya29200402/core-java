class MuseumCreator{
    
    static void getMuseum() {
        Museum museum = new Museum();
        System.out.println("Museum is created");
        System.out.println("=====================");
    }
    
    static void getMuseum(String name) {
        System.out.println("Creating Museum with Name: " + name);
        Museum museum = new Museum(name);
        System.out.println("Museum Name: " + museum.name);
        System.out.println("Museum is Created");
        System.out.println("=====================");
    }
    
    static void getMuseum(String name, String location) {
        System.out.println("Creating Museum with name and location");
        Museum museum = new Museum(name, location);
        System.out.println("Museum Name: " + museum.name);
        System.out.println("Museum Location: " + museum.location);
        System.out.println("Museum is created with name and Location");
        System.out.println("=====================");
    }
}