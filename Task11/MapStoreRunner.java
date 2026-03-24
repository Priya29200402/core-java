class MapStoreRunner{
    public static void main(String[] args){

        Map[] maps=new Map[10];
        MapStore mapStore=new MapStore(maps);

        Map map1=new Map("Kuvempu Nagar", "D-Mart", 3.4, "Bike", false, 40);
        Map map2=new Map("Rajajinagar", "Orion Mall", 5.2, "Car", true, 30);
        Map map3=new Map("BTM Layout", "Forum Mall", 4.8, "Bike", false, 35);
        Map map4=new Map("Whitefield", "Phoenix Marketcity", 8.5, "Car", true, 50);
        Map map5=new Map("Yelahanka", "Airport", 15.0, "Car", true, 60);
        Map map6=new Map("Electronic City", "Infosys", 12.3, "Bike", false, 45);
        Map map7=new Map("Indiranagar", "Metro Station", 2.5, "Walk", false, 15);
        Map map8=new Map("Hebbal", "Esteem Mall", 6.0, "Car", true, 25);
        Map map9=new Map("Jayanagar", "Lalbagh", 3.0, "Bike", false, 20);
        Map map10=new Map("Majestic", "Railway Station", 1.2, "Walk", false, 10);

        mapStore.save(map1);
        mapStore.save(map2);
        mapStore.save(map3);
        mapStore.save(map4);
        mapStore.save(map5);
        mapStore.save(map6);
        mapStore.save(map7);
        mapStore.save(map8);
        mapStore.save(map9);
        mapStore.save(map10);

        map1.printInfo();
        System.out.println("\n");

        map2.printInfo();
        System.out.println("\n");

        map3.printInfo();
        System.out.println("\n");

        map4.printInfo();
        System.out.println("\n");

        map5.printInfo();
        System.out.println("\n");

        map6.printInfo();
        System.out.println("\n");

        map7.printInfo();
        System.out.println("\n");

        map8.printInfo();
        System.out.println("\n");

        map9.printInfo();
        System.out.println("\n");

        map10.printInfo();
    }
}