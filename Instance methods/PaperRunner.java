class PaperRunner{
    public static void main(String[] args) {

        Paper paper1 = new Paper("A4", "White", "JK Paper", 100,
                80.0, "Smooth", "Printing",
                true, false, "India",
                "Rectangle", 500, "Premium",
                "Wood Pulp", "Matte", "JK Mills",
                "12-12-2026", "OfficeSuppliers", "USA", "PA001");

        Paper paper2 = new Paper("A3", "White", "Classmate", 50,
                100.0, "Glossy", "Drawing",
                false, false, "India",
                "Rectangle", 200, "High",
                "Wood Pulp", "Glossy", "ITC",
                "10-10-2026", "SchoolMart", "UK", "PA002");

        Paper paper3 = new Paper("Chart", "Blue", "Navneet", 200,
                120.0, "Rough", "Craft",
                true, false, "India",
                "Rectangle", 100, "Standard",
                "Recycled Fiber", "Matte", "Navneet Ltd",
                "05-05-2026", "CraftWorld", "Canada", "PA003");

        Paper paper4 = new Paper("Sticker", "Multi", "Oddy", 300,
                150.0, "Sticky", "Labeling",
                false, true, "China",
                "Square", 50, "Premium",
                "Synthetic", "Glossy", "Oddy Corp",
                "01-01-2027", "LabelSuppliers", "Australia", "PA004");

        Paper paper5 = new Paper("Tissue", "White", "Origami", 500,
                18.0, "Soft", "Hygiene",
                true, false, "India",
                "Square", 100, "Soft",
                "Recycled Fiber", "Matte", "Origami Pvt Ltd",
                "11-11-2026", "RetailHub", "UAE", "PA005");

        Paper paper6 = new Paper("Cardstock", "Red", "Camel", 150,
                250.0, "Thick", "Craft",
                false, false, "USA",
                "Rectangle", 100, "High",
                "Wood Pulp", "Matte", "Camel Industries",
                "09-09-2026", "ArtSuppliers", "Germany", "PA006");

        Paper paper7 = new Paper("Photo Paper", "White", "HP", 80,
                300.0, "Glossy", "Photo Printing",
                false, true, "Japan",
                "Rectangle", 50, "Premium",
                "Synthetic", "Glossy", "HP Corp",
                "03-03-2027", "TechStore", "Singapore", "PA007");

        Paper paper8 = new Paper("Newspaper", "Grey", "Times Group", 1000,
                45.0, "Rough", "Publishing",
                true, false, "India",
                "Rectangle", 100, "Standard",
                "Recycled Fiber", "Matte", "Times Press",
                "07-07-2026", "MediaHouse", "Malaysia", "PA008");

        Paper paper9 = new Paper("Gift Wrap", "Golden", "Archies", 120,
                90.0, "Smooth", "Decoration",
                false, false, "UK",
                "Rectangle", 20, "Luxury",
                "Foil Paper", "Glossy", "Archies Ltd",
                "08-08-2026", "GiftWorld", "France", "PA009");

        Paper paper10 = new Paper("Butter Paper", "Transparent", "Pigeon", 60,
                40.0, "Smooth", "Baking",
                false, true, "India",
                "Rectangle", 50, "Food Grade",
                "Silicone Coated", "Matte", "Pigeon Foods",
                "02-02-2027", "KitchenMart", "Italy", "PA010");

        paper1.getPaperInfo();
        System.out.println("----------------------");
        paper2.getPaperInfo();
        System.out.println("----------------------");
        paper3.getPaperInfo();
        System.out.println("----------------------");
        paper4.getPaperInfo();
        System.out.println("----------------------");
        paper5.getPaperInfo();
        System.out.println("----------------------");
        paper6.getPaperInfo();
        System.out.println("----------------------");
        paper7.getPaperInfo();
        System.out.println("----------------------");
        paper8.getPaperInfo();
        System.out.println("----------------------");
        paper9.getPaperInfo();
        System.out.println("----------------------");
        paper10.getPaperInfo();
    }
}