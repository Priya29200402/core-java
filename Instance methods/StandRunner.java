class StandRunner{
    public static void main(String[] args){

        Stand stand1 = new Stand("Laptop Stand", "Black", 1200.0, 15.0,
                25.0, "Aluminum", "Office",
                true, true, "India",
                50, "Modern", "Matte",
                "Adjustable", "10kg", "Portronics",
                "1 Year", "Electronics", "TechSuppliers", "S001");

        Stand stand2 = new Stand("Mobile Stand", "White", 300.0, 10.0,
                8.0, "Plastic", "Home",
                true, true, "China",
                150, "Simple", "Glossy",
                "Fixed", "2kg", "Boat",
                "6 Months", "Accessories", "GadgetWorld", "S002");

        Stand stand3 = new Stand("TV Stand", "Brown", 8500.0, 120.0,
                45.0, "Wood", "Living Room",
                false, false, "India",
                20, "Classic", "Polished",
                "Cabinet", "50kg", "HomeCentre",
                "2 Years", "Furniture", "FurniHouse", "S003");

        Stand stand4 = new Stand("Speaker Stand", "Black", 2500.0, 100.0,
                30.0, "Steel", "Studio",
                false, false, "USA",
                15, "Professional", "Matte",
                "Floor", "20kg", "JBL",
                "1 Year", "Audio", "SoundSuppliers", "S004");

        Stand stand5 = new Stand("Book Stand", "Blue", 500.0, 12.0,
                20.0, "Plastic", "Study",
                true, true, "India",
                80, "Ergonomic", "Matte",
                "Tabletop", "5kg", "Classmate",
                "6 Months", "Stationery", "EduMart", "S005");

        Stand stand6 = new Stand("Mic Stand", "Silver", 1800.0, 150.0,
                35.0, "Steel", "Stage",
                true, true, "Germany",
                25, "Adjustable", "Chrome",
                "Tripod", "15kg", "Behringer",
                "1 Year", "Music", "StageWorld", "S006");

        Stand stand7 = new Stand("Plant Stand", "Green", 2200.0, 60.0,
                40.0, "Iron", "Garden",
                false, false, "India",
                35, "Vintage", "Glossy",
                "Decorative", "25kg", "IKEA",
                "2 Years", "Home Decor", "GardenSuppliers", "S007");

        Stand stand8 = new Stand("Monitor Stand", "Grey", 1500.0, 20.0,
                50.0, "Wood", "Office",
                false, false, "Japan",
                45, "Minimal", "Matte",
                "Desk", "15kg", "HP",
                "1 Year", "Electronics", "OfficeMart", "S008");

        Stand stand9 = new Stand("Shoe Stand", "Black", 3200.0, 100.0,
                60.0, "Plastic", "Home",
                false, false, "India",
                30, "Modern", "Matte",
                "Rack", "30kg", "Nilkamal",
                "1 Year", "Furniture", "HomeNeeds", "S009");

        Stand stand10 = new Stand("Camera Stand", "Black", 4500.0, 170.0,
                40.0, "Aluminum", "Photography",
                true, true, "USA",
                18, "Professional", "Matte",
                "Tripod", "8kg", "Canon",
                "2 Years", "Photography", "CamSuppliers", "S010");

        stand1.getStandInfo();
        System.out.println("----------------------");
        stand2.getStandInfo();
        System.out.println("----------------------");
        stand3.getStandInfo();
        System.out.println("----------------------");
        stand4.getStandInfo();
        System.out.println("----------------------");
        stand5.getStandInfo();
        System.out.println("----------------------");
        stand6.getStandInfo();
        System.out.println("----------------------");
        stand7.getStandInfo();
        System.out.println("----------------------");
        stand8.getStandInfo();
        System.out.println("----------------------");
        stand9.getStandInfo();
        System.out.println("----------------------");
        stand10.getStandInfo();
    }
}