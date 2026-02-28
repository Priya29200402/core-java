class PepperRunner{
    public static void main(String[] args){

        Pepper pepper1 = new Pepper("Black Pepper", "Black", 1.0, 500.0,
                "India", "Hot", "Packet", "Everest",
                "12-12-2026", true, true, "Whole",
                100, "A", "SpiceWorld",
                "Cool & Dry Place", "FSSAI", "Local",
                "USA", "P001");

        Pepper pepper2 = new Pepper("White Pepper", "White", 0.5, 650.0,
                "Vietnam", "Mild Hot", "Bottle", "Catch",
                "10-10-2026", false, true, "Powder",
                80, "Premium", "Global Spices",
                "Dry Area", "ISO", "International",
                "UK", "P002");

        Pepper pepper3 = new Pepper("Green Pepper", "Green", 0.75, 700.0,
                "Brazil", "Fresh Spicy", "Box", "MDH",
                "05-08-2026", true, true, "Crushed",
                60, "A+", "FreshFoods",
                "Refrigerated", "Organic Certified", "Retail",
                "Canada", "P003");

        Pepper pepper4 = new Pepper("Red Pepper", "Red", 1.5, 450.0,
                "China", "Very Hot", "Packet", "Aachi",
                "01-01-2027", false, true, "Powder",
                120, "B", "SpiceHub",
                "Cool Storage", "FSSAI", "Wholesale",
                "Australia", "P004");

        Pepper pepper5 = new Pepper("Pink Pepper", "Pink", 0.25, 900.0,
                "Peru", "Sweet Spicy", "Jar", "Organic India",
                "11-11-2026", true, false, "Whole",
                40, "Premium", "NatureSpices",
                "Dry Place", "USDA Organic", "Luxury",
                "France", "P005");

        Pepper pepper6 = new Pepper("Black Pepper", "Dark Black", 2.0, 950.0,
                "India", "Strong Hot", "Bag", "Eastern",
                "09-09-2026", true, true, "Whole",
                200, "Export Quality", "AgroSuppliers",
                "Warehouse", "ISO", "Export",
                "Germany", "P006");

        Pepper pepper7 = new Pepper("White Pepper", "Cream", 1.2, 800.0,
                "Indonesia", "Sharp", "Packet", "Keya",
                "03-03-2027", false, true, "Powder",
                90, "A", "SpiceExporters",
                "Cool Area", "FSSAI", "Retail",
                "Japan", "P007");

        Pepper pepper8 = new Pepper("Green Pepper", "Light Green", 0.6, 720.0,
                "Sri Lanka", "Medium Hot", "Box", "Snapin",
                "07-07-2026", true, true, "Crushed",
                75, "A+", "FarmFresh",
                "Refrigerated", "Organic Certified", "Local",
                "Singapore", "P008");

        Pepper pepper9 = new Pepper("Red Pepper", "Bright Red", 1.0, 500.0,
                "Thailand", "Extra Hot", "Bottle", "Priya",
                "08-08-2026", false, true, "Powder",
                110, "Standard", "AsiaSpices",
                "Dry Storage", "ISO", "Wholesale",
                "Malaysia", "P009");

        Pepper pepper10 = new Pepper("Black Pepper", "Jet Black", 0.9, 880.0,
                "India", "Aromatic Hot", "Jar", "24 Mantra",
                "02-02-2027", true, true, "Whole",
                130, "Premium", "OrganicSuppliers",
                "Cool & Dry", "USDA Organic", "International",
                "UAE", "P010");

        pepper1.getPepperInfo();
        System.out.println("----------------------");
        pepper2.getPepperInfo();
        System.out.println("----------------------");
        pepper3.getPepperInfo();
        System.out.println("----------------------");
        pepper4.getPepperInfo();
        System.out.println("----------------------");
        pepper5.getPepperInfo();
        System.out.println("----------------------");
        pepper6.getPepperInfo();
        System.out.println("----------------------");
        pepper7.getPepperInfo();
        System.out.println("----------------------");
        pepper8.getPepperInfo();
        System.out.println("----------------------");
        pepper9.getPepperInfo();
        System.out.println("----------------------");
        pepper10.getPepperInfo();
    }
}