class StadiumCreator{

    static void getStadium(){
        Stadium stadium = new Stadium();
        System.out.println("Stadium Name: " + stadium.name);
        System.out.println("Capacity: " + stadium.capacity);
        System.out.println("=====================");
    }

    static void getStadium(String name) {
        System.out.println("Creating Stadium with Name: " + name);
        Stadium stadium = new Stadium(name);
        System.out.println("Stadium Name: " + stadium.name);
        System.out.println("=====================");
    }

    static void getStadium(String name, int capacity) {
        System.out.println("Creating Stadium with name and capacity");
        Stadium stadium = new Stadium(name, capacity);
        System.out.println("Stadium Name: " + stadium.name);
        System.out.println("Capacity: " + stadium.capacity);
        System.out.println("=====================");
    }
}