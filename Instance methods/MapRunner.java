class MapRunner{
    public static void main(String[] args) {

        Map map1 = new Map("World Political Map", "Political", "World", 1.0,
                "English", false, "Oxford Publishers",
                1, "Large", "Paper",
                "5th Edition", 2022, "Multi Color",
                true, "Mercator",
                "UK", 250.0, "Educational",
                "M001", "EduSuppliers");

        Map map2 = new Map("India Physical Map", "Physical", "India", 2.5,
                "Hindi", false, "NCERT",
                1, "Medium", "Paper",
                "3rd Edition", 2021, "Green & Blue",
                true, "Robinson",
                "India", 150.0, "School",
                "M002", "SchoolMart");

        Map map3 = new Map("Asia Road Map", "Road", "Asia", 5.0,
                "English", true, "National Geographic",
                120, "Compact", "Glossy Paper",
                "2nd Edition", 2023, "Bright",
                false, "Mercator",
                "USA", 500.0, "Travel",
                "M003", "TravelWorld");

        Map map4 = new Map("Europe Tourist Map", "Tourist", "Europe", 3.0,
                "French", true, "Lonely Planet",
                80, "Pocket", "Laminated Paper",
                "4th Edition", 2020, "Colorful",
                true, "Gall-Peters",
                "France", 400.0, "Tourism",
                "M004", "TourSuppliers");

        Map map5 = new Map("Karnataka District Map", "Administrative", "Karnataka", 1.5,
                "Kannada", false, "State Govt Press",
                1, "Large", "Paper",
                "1st Edition", 2019, "Standard",
                true, "Mercator",
                "India", 100.0, "Government",
                "M005", "GovtSuppliers");

        Map map6 = new Map("USA Satellite Map", "Satellite", "USA", 4.0,
                "English", true, "NASA",
                200, "Large", "Glossy",
                "6th Edition", 2024, "Dark Theme",
                false, "Robinson",
                "USA", 800.0, "Research",
                "M006", "ScienceHub");

        Map map7 = new Map("Africa Wildlife Map", "Thematic", "Africa", 2.0,
                "English", false, "WildLife Org",
                60, "Medium", "Matte Paper",
                "2nd Edition", 2022, "Nature Theme",
                true, "Mercator",
                "South Africa", 350.0, "Wildlife",
                "M007", "NatureSuppliers");

        Map map8 = new Map("Australia Climate Map", "Climate", "Australia", 3.5,
                "English", true, "GeoPublishers",
                90, "Large", "Synthetic",
                "3rd Edition", 2023, "Blue Theme",
                false, "Robinson",
                "Australia", 450.0, "Research",
                "M008", "ClimateWorld");

        Map map9 = new Map("City Metro Map", "Transport", "Tokyo", 1.0,
                "Japanese", true, "Metro Corp",
                10, "Pocket", "Plastic",
                "10th Edition", 2024, "Simple",
                true, "Mercator",
                "Japan", 200.0, "Transport",
                "M009", "CitySuppliers");

        Map map10 = new Map("Historical World Map", "Historical", "World", 2.0,
                "English", false, "History Press",
                150, "Large", "Matte",
                "1st Edition", 2018, "Vintage",
                true, "Gall-Peters",
                "USA", 600.0, "History",
                "M010", "BookWorld");

        map1.getMapInfo();
        System.out.println("----------------------");
        map2.getMapInfo();
        System.out.println("----------------------");
        map3.getMapInfo();
        System.out.println("----------------------");
        map4.getMapInfo();
        System.out.println("----------------------");
        map5.getMapInfo();
        System.out.println("----------------------");
        map6.getMapInfo();
        System.out.println("----------------------");
        map7.getMapInfo();
        System.out.println("----------------------");
        map8.getMapInfo();
        System.out.println("----------------------");
        map9.getMapInfo();
        System.out.println("----------------------");
        map10.getMapInfo();
    }
}