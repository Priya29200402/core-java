class LotionRunner{
    public static void main(String[] args){

        Lotion lotion1 = new Lotion("Aloe Moisturizer", "Nivea", 199.99, 200,
                "Aloe", "All Skin Types", "Aloe Vera, Glycerin",
                "White", "Smooth", false, true,
                "12/2026", "01/2024", "India",
                "Apply twice daily", "Bottle",
                50, "Body Care", "ABC Suppliers", "L001");

        Lotion lotion2 = new Lotion("Cocoa Butter Lotion", "Vaseline", 249.99, 300,
                "Cocoa", "Dry Skin", "Cocoa Butter, Vitamin E",
                "Cream", "Thick", false, false,
                "11/2026", "02/2024", "India",
                "Use after bath", "Bottle",
                40, "Body Care", "XYZ Traders", "L002");

        Lotion lotion3 = new Lotion("Herbal Glow", "Himalaya", 180.00, 150,
                "Herbal", "Sensitive Skin", "Neem, Turmeric",
                "Light Green", "Light", true, true,
                "10/2026", "03/2024", "India",
                "Apply gently on skin", "Tube",
                35, "Skin Care", "Herbal Distributors", "L003");

        Lotion lotion4 = new Lotion("Rose Soft Lotion", "Dove", 220.50, 250,
                "Rose", "Normal Skin", "Rose Extract, Milk",
                "Pink", "Smooth", false, false,
                "09/2026", "01/2024", "India",
                "Daily use", "Bottle",
                60, "Body Care", "Beauty Suppliers", "L004");

        Lotion lotion5 = new Lotion("Medicare Lotion", "Cetaphil", 350.75, 100,
                "Mild", "Oily Skin", "Salicylic Acid",
                "White", "Light", true, false,
                "08/2026", "02/2024", "USA",
                "Use as prescribed", "Pump Bottle",
                20, "Medical", "Health Distributors", "L005");

        Lotion lotion6 = new Lotion("Organic Care", "Biotique", 275.00, 200,
                "Lavender", "All Skin Types", "Lavender Oil, Aloe",
                "Light Purple", "Silky", false, true,
                "07/2026", "04/2024", "India",
                "Apply before sleep", "Bottle",
                45, "Organic", "Nature Traders", "L006");

        Lotion lotion7 = new Lotion("Men Active Lotion", "Nivea Men", 299.99, 250,
                "Fresh", "Men Skin", "Menthol, Vitamin E",
                "White", "Cool", false, false,
                "06/2026", "03/2024", "Germany",
                "After shave use", "Bottle",
                55, "Men Care", "Global Suppliers", "L007");

        Lotion lotion8 = new Lotion("Baby Soft", "Johnson's", 210.00, 200,
                "Baby Powder", "Baby Skin", "Milk Protein",
                "White", "Soft", false, false,
                "05/2026", "01/2024", "India",
                "Apply on baby skin", "Bottle",
                70, "Baby Care", "Kids Suppliers", "L008");

        Lotion lotion9 = new Lotion("Sun Protect Lotion", "Lakme", 320.00, 100,
                "Mild", "All Skin Types", "SPF 30, Aloe",
                "White", "Light", false, false,
                "04/2026", "02/2024", "India",
                "Apply before sun exposure", "Tube",
                30, "Sun Care", "Cosmetic Hub", "L009");

        Lotion lotion10 = new Lotion("Night Repair Lotion", "Olay", 450.00, 150,
                "Mild", "All Skin Types", "Retinol, Vitamin B3",
                "Cream", "Smooth", false, false,
                "03/2026", "01/2024", "USA",
                "Apply at night", "Jar",
                25, "Premium Care", "Elite Suppliers", "L010");

        lotion1.getLotionInfo();
        System.out.println("-----------------------");
        lotion2.getLotionInfo();
        System.out.println("-----------------------");
        lotion3.getLotionInfo();
        System.out.println("-----------------------");
        lotion4.getLotionInfo();
        System.out.println("-----------------------");
        lotion5.getLotionInfo();
        System.out.println("-----------------------");
        lotion6.getLotionInfo();
        System.out.println("-----------------------");
        lotion7.getLotionInfo();
        System.out.println("-----------------------");
        lotion8.getLotionInfo();
        System.out.println("-----------------------");
        lotion9.getLotionInfo();
        System.out.println("-----------------------");
        lotion10.getLotionInfo();
        System.out.println("-----------------------");
    }
}