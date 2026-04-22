package com.xworkz.task_crud;

public class CountryRunner {

    public static void main(String[] args) {

        System.out.println("\n==========Collectors in Karnataka==========");
        Collector collector1=new Collector("Majjikarjun", 2026);
        Collector collector2=new Collector("Prema", 2027);
        Collector collector3=new Collector("Mahananda", 2027);
        Collector collector4=new Collector("Kashinath", 2027);

        System.out.println("\n=========Districts in Karnataka========");
        District district1=new District("Bangalore", collector1);
        District district2=new District("Mysore", collector2);
        District district3=new District("Hubli", collector3);
        District district4=new District("Belgaum", collector4);

        District[] districts=new District[4];
        districts[0]=district1;
        districts[1]=district2;
        districts[2]=district3;
        districts[3]=district4;

        System.out.println("\n===========Cities=========");
        City city1=new City("Bangalore", 4, districts);
        City city2=new City("Mysore", 4, districts);
        City city3=new City("Hubli", 4, districts);
        City city4=new City("Belgaum", 4, districts);

        City[] cities=new City[4];
        cities[0]=city1;
        cities[1]=city2;
        cities[2]=city3;
        cities[3]=city4;

        System.out.println("\n===========States=========");
        State state1=new State("Odisa", 47277000, cities);
        State state2=new State("Tamil Nadu", 72147030, cities);
        State[] states=new State[2];
        states[0]=state1;
        states[1]=state2;

        System.out.println("\n===========Addresses=========");
        Address address1=new Address(1163, 560001, state1);
        Address address2=new Address(1892, 560001, state2);

        System.out.println("\n===========Presidents=========");
        President president1=new President(address1, 60, "Droupadi Murmu");
        President president2=new President(address2, 72, "Ram Nath Kovind");

        Country country1=new Country("India", president1, states);
        CountryStore store1=new CountryStore();
        store1.save(country1);

        System.out.println("\n===========Countries=========");
        Country country2=new Country("India", president1, states);
        CountryStore store2=new CountryStore();
        store2.save(country2);

        System.out.println("\n===========Finding Country by name=========");
        Country foundCountry=store1.findByName("India");
        if (foundCountry != null) {
            System.out.println("Coutry Found");
            System.out.println(foundCountry);
        } else {
            System.out.println("Country not found");
        }

        System.out.println("\n===========Finding State by name=========");
        State foundState=store2.findStateByStateName("Karnataka");
        if (foundState != null) {
            System.out.println("State Found");
            System.out.println(foundState);
        } else {
            System.out.println("State not found");
        }

        System.out.println("\n===========Finding Cities by State name=========");
        City[] foundCities = store1.findAllCityByStateName("Karnataka");
        if (foundCities != null) {
            System.out.println("Cities in Karnataka");
            for (int i = 0; i < foundCities.length; i++) {
                if (foundCities[i] != null) {
                    System.out.println(foundCities[i]);
                }
            }
        } else {
            System.out.println("cities found");
        }

        System.out.println("\n===========Finding No of Districts by City name=========");
        int count=store1.findNoOfDistrictsByCityName("Bangalore");
        System.out.println("No of Districts in Bangalore:" + count);

        System.out.println("\n===========Finding Country by Collector name=========");
        Country collectorCountry=store1.findByCollectorName("Majjikarjun");
        if (collectorCountry != null) {
            System.out.println("Country found by Collector");
            System.out.println(collectorCountry);
        } else {
            System.out.println("Collector not found");
        }
    }
}