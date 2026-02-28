class ConditionerRunner{

    public static void main(String[] args){

        Conditioner conditioner1 = new Conditioner("Dove", "Hair Fall Rescue", "Anti Hair Fall", "Dry",
                340, 260, "Mild Floral",
                true, true, "White",
                "Unilever", "India", "2027-06-15",
                "Keratin, Glycerin", "Bottle",
                "After Shampoo", "Personal Care",
                "CO001", 50, "BeautySupply");

        Conditioner conditioner2 = new Conditioner("Pantene", "Smooth & Silky", "Smoothening", "Frizzy",
                300, 240, "Fresh",
                false, false, "White",
                "P&G", "India", "2027-02-20",
                "Pro-V Formula", "Bottle",
                "After Wash", "Hair Care",
                "CO002", 60, "CosmeticWorld");

        Conditioner conditioner3 = new Conditioner("Tresemme", "Keratin Smooth", "Repair", "Damaged",
                370, 360, "Salon Fresh",
                true, true, "Cream",
                "Unilever", "USA", "2026-12-30",
                "Keratin", "Bottle",
                "Daily Use", "Salon Care",
                "CO003", 30, "StyleMart");

        Conditioner conditioner4 = new Conditioner("Loreal", "Total Repair 5", "Repair", "Damaged",
                280, 330, "Pleasant",
                true, true, "Cream",
                "Loreal Pvt Ltd", "France", "2027-01-18",
                "Ceramide", "Tube",
                "After Shampoo", "Premium",
                "CO004", 40, "BeautyHub");

        Conditioner conditioner5 = new Conditioner("Sunsilk", "Black Shine", "Shine", "Dull",
                340, 210, "Sweet",
                false, false, "Black",
                "Unilever", "India", "2026-10-10",
                "Amla Pearl", "Bottle",
                "Regular Use", "Hair Care",
                "CO005", 55, "RetailShop");

        Conditioner conditioner6 = new Conditioner("Himalaya", "Protein Conditioner", "Herbal", "All Hair Types",
                400, 220, "Herbal",
                true, true, "Green",
                "Himalaya Wellness", "India", "2027-09-05",
                "Amla, Chickpea", "Bottle",
                "After Wash", "Ayurvedic",
                "CO006", 70, "HerbalStore");

        Conditioner conditioner7 = new Conditioner("WOW", "Apple Cider Vinegar", "Clarifying", "Oily",
                300, 460, "Apple",
                true, true, "Light Brown",
                "WOW Skin Science", "India", "2027-04-28",
                "Apple Cider Vinegar", "Pump Bottle",
                "Twice a Week", "Organic",
                "CO007", 25, "OrganicMart");

        Conditioner conditioner8 = new Conditioner("Biotique", "Bio Thyme", "Anti Dandruff", "Oily",
                340, 210, "Herbal",
                true, true, "Green",
                "Biotique Ltd", "India", "2026-08-15",
                "Thyme Extract", "Bottle",
                "Regular Use", "Herbal",
                "CO008", 65, "AyurvedaStore");

        Conditioner conditioner9 = new Conditioner("Clinic Plus", "Strong & Long", "Strength", "Normal",
                350, 200, "Mild",
                false, false, "White",
                "Unilever", "India", "2026-11-22",
                "Milk Protein", "Bottle",
                "After Shampoo", "Personal Care",
                "CO009", 45, "SuperMarket");

        Conditioner conditioner10 = new Conditioner("Head & Shoulders", "Smooth Silky", "Anti Dandruff", "Dry",
                360, 300, "Menthol",
                false, true, "White",
                "P&G", "USA", "2027-03-12",
                "ZPT, Menthol", "Bottle",
                "Twice a Week", "Hair Care",
                "CO010", 35, "HairMart");

        conditioner1.getConditionerInfo();
        conditioner2.getConditionerInfo();
        conditioner3.getConditionerInfo();
        conditioner4.getConditionerInfo();
        conditioner5.getConditionerInfo();
        conditioner6.getConditionerInfo();
        conditioner7.getConditionerInfo();
        conditioner8.getConditionerInfo();
        conditioner9.getConditionerInfo();
        conditioner10.getConditionerInfo();
    }
}