class GarlicRunner{
    public static void main(String[] args){

        Garlic garlic1 = new Garlic("White Garlic", "White", 1.0, 120.0,
                "India", "Strong", "Net Bag", "FreshFarm",
                "12-12-2026", true, false,
                "Whole", 100, "A",
                "AgroSuppliers", "Cool & Dry", "FSSAI",
                "Local", "UAE", "G001");

        Garlic garlic2 = new Garlic("Red Garlic", "Red", 0.5, 150.0,
                "China", "Very Strong", "Box", "SpiceWorld",
                "10-10-2026", false, false,
                "Whole", 80, "Premium",
                "Global Traders", "Dry Storage", "ISO",
                "International", "USA", "G002");

        Garlic garlic3 = new Garlic("Organic Garlic", "White", 0.75, 200.0,
                "India", "Mild Strong", "Packet", "Organic India",
                "05-08-2026", true, true,
                "Cloves", 60, "A+",
                "NatureSuppliers", "Refrigerated", "USDA Organic",
                "Retail", "UK", "G003");

        Garlic garlic4 = new Garlic("Elephant Garlic", "Off White", 1.5, 250.0,
                "Spain", "Mild", "Crate", "EuroFresh",
                "01-01-2027", false, false,
                "Whole", 40, "Export Quality",
                "Euro Traders", "Cool Storage", "ISO",
                "Export", "Germany", "G004");

        Garlic garlic5 = new Garlic("Peeled Garlic", "White", 0.25, 180.0,
                "India", "Strong", "Vacuum Pack", "KitchenFresh",
                "11-11-2026", true, true,
                "Peeled Cloves", 70, "Premium",
                "KitchenSupplies", "Refrigerated", "FSSAI",
                "Wholesale", "Singapore", "G005");

        Garlic garlic6 = new Garlic("Black Garlic", "Black", 0.4, 350.0,
                "Japan", "Sweet Mild", "Jar", "HealthPlus",
                "09-09-2026", true, true,
                "Fermented", 30, "Luxury",
                "HealthSuppliers", "Cool Place", "Organic Certified",
                "Luxury", "France", "G006");

        Garlic garlic7 = new Garlic("Desi Garlic", "White", 1.2, 140.0,
                "India", "Strong", "Sack", "VillageFarm",
                "03-03-2027", false, false,
                "Whole", 150, "Standard",
                "Local Farmers", "Dry Area", "FSSAI",
                "Local", "Malaysia", "G007");

        Garlic garlic8 = new Garlic("Chinese Garlic", "Pure White", 2.0, 300.0,
                "China", "Medium Strong", "Box", "AsiaFoods",
                "07-07-2026", false, false,
                "Whole", 200, "A",
                "Asia Exporters", "Warehouse", "ISO",
                "Export", "Canada", "G008");

        Garlic garlic9 = new Garlic("Mini Garlic", "White", 0.6, 130.0,
                "India", "Sharp", "Packet", "DailyFresh",
                "08-08-2026", true, false,
                "Whole", 90, "B",
                "Fresh Traders", "Cool & Dry", "FSSAI",
                "Retail", "Australia", "G009");

        Garlic garlic10 = new Garlic("Garlic Powder", "Off White", 0.3, 220.0,
                "USA", "Strong", "Bottle", "SpiceMaster",
                "02-02-2027", false, true,
                "Powder", 110, "Premium",
                "SpiceExporters", "Dry Storage", "ISO",
                "International", "UK", "G010");

        garlic1.getGarlicInfo();
        System.out.println("----------------------");
        garlic2.getGarlicInfo();
        System.out.println("----------------------");
        garlic3.getGarlicInfo();
        System.out.println("----------------------");
        garlic4.getGarlicInfo();
        System.out.println("----------------------");
        garlic5.getGarlicInfo();
        System.out.println("----------------------");
        garlic6.getGarlicInfo();
        System.out.println("----------------------");
        garlic7.getGarlicInfo();
        System.out.println("----------------------");
        garlic8.getGarlicInfo();
        System.out.println("----------------------");
        garlic9.getGarlicInfo();
        System.out.println("----------------------");
        garlic10.getGarlicInfo();
    }
}