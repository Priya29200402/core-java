class ShampooRunner{

    public static void main(String[] args){

        Shampoo shampoo1 = new Shampoo("Dove", "Hair Fall Rescue", "Anti Hair Fall", "Dry",
                340, 250, "Mild Floral",
                true, true, "White",
                "Unilever", "India", "2027-05-12",
                "Keratin, Glycerin", "Bottle",
                "Daily Use", "Personal Care",
                "SH001", 50, "BeautySupply");

        Shampoo shampoo2 = new Shampoo("Head & Shoulders", "Cool Menthol", "Anti Dandruff", "Oily",
                360, 280, "Menthol",
                false, true, "Blue",
                "P&G", "USA", "2026-11-20",
                "ZPT, Menthol", "Bottle",
                "Twice a Week", "Hair Care",
                "SH002", 40, "HairMart");

        Shampoo shampoo3 = new Shampoo("Pantene", "Smooth & Silky", "Smoothening", "Frizzy",
                300, 230, "Fresh",
                false, false, "White",
                "P&G", "India", "2027-03-18",
                "Pro-V Formula", "Bottle",
                "Daily Use", "Hair Care",
                "SH003", 60, "CosmeticWorld");

        Shampoo shampoo4 = new Shampoo("Clinic Plus", "Strong & Long", "Strength", "Normal",
                340, 190, "Mild",
                false, false, "White",
                "Unilever", "India", "2026-09-10",
                "Milk Protein", "Bottle",
                "Regular Use", "Personal Care",
                "SH004", 55, "SuperMarket");

        Shampoo shampoo5 = new Shampoo("Loreal", "Total Repair 5", "Repair", "Damaged",
                280, 320, "Pleasant",
                true, true, "Cream",
                "Loreal Pvt Ltd", "France", "2027-01-25",
                "Ceramide", "Bottle",
                "Daily Use", "Premium",
                "SH005", 35, "BeautyHub");

        Shampoo shampoo6 = new Shampoo("Tresemme", "Keratin Smooth", "Smoothening", "Frizzy",
                370, 350, "Salon Fresh",
                true, true, "White",
                "Unilever", "USA", "2026-12-14",
                "Keratin", "Bottle",
                "Daily Use", "Salon Care",
                "SH006", 30, "StyleMart");

        Shampoo shampoo7 = new Shampoo("Himalaya", "Anti Hair Fall", "Herbal", "All Hair Types",
                400, 210, "Herbal",
                true, true, "Green",
                "Himalaya Wellness", "India", "2027-08-30",
                "Bhringraj, Amla", "Bottle",
                "Regular Use", "Ayurvedic",
                "SH007", 70, "HerbalStore");

        Shampoo shampoo8 = new Shampoo("Sunsilk", "Black Shine", "Shine", "Dull",
                340, 220, "Sweet",
                false, false, "Black",
                "Unilever", "India", "2026-10-05",
                "Amla Pearl", "Bottle",
                "Daily Use", "Hair Care",
                "SH008", 45, "RetailShop");

        Shampoo shampoo9 = new Shampoo("WOW", "Apple Cider Vinegar", "Clarifying", "Oily",
                300, 450, "Apple",
                true, true, "Brown",
                "WOW Skin Science", "India", "2027-04-22",
                "Apple Cider Vinegar", "Pump Bottle",
                "Twice a Week", "Organic",
                "SH009", 25, "OrganicMart");

        Shampoo shampoo10 = new Shampoo("Biotique", "Bio Kelp", "Protein", "Falling Hair",
                340, 199, "Herbal",
                true, true, "Green",
                "Biotique Ltd", "India", "2026-07-15",
                "Kelp Extract", "Bottle",
                "Regular Use", "Herbal",
                "SH010", 65, "AyurvedaStore");

        shampoo1.getShampooInfo();
        shampoo2.getShampooInfo();
        shampoo3.getShampooInfo();
        shampoo4.getShampooInfo();
        shampoo5.getShampooInfo();
        shampoo6.getShampooInfo();
        shampoo7.getShampooInfo();
        shampoo8.getShampooInfo();
        shampoo9.getShampooInfo();
        shampoo10.getShampooInfo();
    }
}