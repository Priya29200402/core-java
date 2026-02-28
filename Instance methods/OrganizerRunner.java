class OrganizerRunner{
    public static void main(String[] args){

        Organizer org1 = new Organizer("Desk File Organizer", "Office", 599.99, "Plastic",
                "Black", 5, true, false, "Cello", "Office Desk",
                30.5, 25.0, 1.2, "Modern", "India",
                40, "1 Year", "Office Supplies", "ABC Traders", "O001");

        Organizer org2 = new Organizer("Makeup Organizer", "Cosmetic", 899.50, "Acrylic",
                "Transparent", 8, true, true, "Lakme", "Dressing Table",
                20.0, 15.0, 0.8, "Elegant", "China",
                30, "6 Months", "Beauty", "Beauty Hub", "O002");

        Organizer org3 = new Organizer("Kitchen Shelf Organizer", "Kitchen", 1299.00, "Steel",
                "Silver", 4, false, true, "Prestige", "Kitchen Storage",
                40.0, 35.0, 2.5, "Compact", "India",
                20, "2 Years", "Home", "Home Needs", "O003");

        Organizer org4 = new Organizer("Wardrobe Organizer", "Clothing", 1499.75, "Fabric",
                "Grey", 6, true, false, "Ikea", "Clothes Storage",
                50.0, 45.0, 1.8, "Foldable", "Sweden",
                25, "1 Year", "Home", "Global Furnishers", "O004");

        Organizer org5 = new Organizer("Car Trunk Organizer", "Automobile", 1099.99, "Polyester",
                "Black", 3, true, true, "AutoCare", "Car Storage",
                35.0, 30.0, 1.5, "Heavy Duty", "USA",
                15, "1 Year", "Auto Accessories", "Car Needs", "O005");

        Organizer org6 = new Organizer("Toy Storage Organizer", "Kids", 799.00, "Plastic",
                "Blue", 5, true, false, "FunZone", "Toy Storage",
                45.0, 40.0, 2.0, "Cartoon Design", "India",
                18, "6 Months", "Kids", "Kids World", "O006");

        Organizer org7 = new Organizer("Document Organizer", "Office", 699.99, "Leather",
                "Brown", 7, true, false, "Wildcraft", "Document Storage",
                28.0, 22.0, 1.0, "Professional", "India",
                22, "1 Year", "Office Supplies", "Stationery Mart", "O007");

        Organizer org8 = new Organizer("Bathroom Rack Organizer", "Bathroom", 1199.00, "Steel",
                "White", 4, false, true, "HomePlus", "Bathroom Storage",
                38.0, 32.0, 2.2, "Wall Mounted", "India",
                12, "2 Years", "Home", "Sanitary Suppliers", "O008");

        Organizer org9 = new Organizer("Jewelry Organizer", "Accessories", 950.00, "Wood",
                "Brown", 10, true, false, "CraftHouse", "Jewelry Storage",
                25.0, 20.0, 1.3, "Vintage", "India",
                10, "1 Year", "Fashion", "Craft Suppliers", "O009");

        Organizer org10 = new Organizer("Study Table Organizer", "Student", 499.99, "Plastic",
                "Green", 6, true, false, "Classmate", "Study Desk",
                22.0, 18.0, 0.9, "Simple", "India",
                35, "6 Months", "Education", "School Mart", "O010");

        org1.getOrganizerInfo();
        System.out.println("-----------------------");
        org2.getOrganizerInfo();
        System.out.println("-----------------------");
        org3.getOrganizerInfo();
        System.out.println("-----------------------");
        org4.getOrganizerInfo();
        System.out.println("-----------------------");
        org5.getOrganizerInfo();
        System.out.println("-----------------------");
        org6.getOrganizerInfo();
        System.out.println("-----------------------");
        org7.getOrganizerInfo();
        System.out.println("-----------------------");
        org8.getOrganizerInfo();
        System.out.println("-----------------------");
        org9.getOrganizerInfo();
        System.out.println("-----------------------");
        org10.getOrganizerInfo();
        System.out.println("-----------------------");
    }
}