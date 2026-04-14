class DumbBellRunner{

    public static void main(String[] args){

        DumbBell dumbBell1 = new DumbBell("PowerFit", 5.0, "Iron",
                "Black", false, "Knurled",
                1200, "Small", "Home Workout", 50,
                "Round", "Chrome", true,
                "India", "1 Year", "Fitness",
                "PF-5KG", "GymSupply",
                30.0, "DB001");

        DumbBell dumbBell2 = new DumbBell("MusclePro", 10.0, "Steel",
                "Silver", false, "Textured",
                2500, "Medium", "Gym", 40,
                "Hex", "Powder Coated", true,
                "USA", "2 Years", "Professional",
                "MP-10KG", "FitWorld",
                35.0, "DB002");

        DumbBell dumbBell3 = new DumbBell("FlexiLift", 15.0, "Iron",
                "Red", true, "Rubber Grip",
                4000, "Large", "Strength Training", 30,
                "Round", "Rubber", true,
                "Germany", "3 Years", "Adjustable",
                "FL-15KG", "StrongMart",
                40.0, "DB003");

        DumbBell dumbBell4 = new DumbBell("IronMax", 20.0, "Cast Iron",
                "Black", false, "Knurled",
                5500, "Large", "Bodybuilding", 25,
                "Hex", "Matte", false,
                "UK", "2 Years", "Heavy",
                "IM-20KG", "GymStore",
                45.0, "DB004");

        DumbBell dumbBell5 = new DumbBell("FitZone", 2.5, "Steel",
                "Blue", false, "Foam",
                800, "Small", "Beginner", 60,
                "Round", "Painted", false,
                "India", "6 Months", "Lightweight",
                "FZ-2KG", "HomeFit",
                25.0, "DB005");

        DumbBell dumbBell6 = new DumbBell("TitanLift", 25.0, "Iron",
                "Black", false, "Rubber Grip",
                7000, "Extra Large", "Professional", 20,
                "Hex", "Rubber", true,
                "USA", "5 Years", "Premium",
                "TL-25KG", "ProGym",
                50.0, "DB006");

        DumbBell dumbBell7 = new DumbBell("StrongCore", 12.5, "Steel",
                "Grey", true, "Textured",
                3200, "Medium", "Fitness", 35,
                "Round", "Powder Coated", true,
                "Canada", "2 Years", "Adjustable",
                "SC-12KG", "FitMart",
                38.0, "DB007");

        DumbBell dumbBell8 = new DumbBell("BodyTone", 7.5, "Iron",
                "Green", false, "Foam",
                1500, "Small", "Home Gym", 45,
                "Round", "Painted", false,
                "Australia", "1 Year", "Standard",
                "BT-7KG", "GymHouse",
                32.0, "DB008");

        DumbBell dumbBell9 = new DumbBell("MaxPump", 30.0, "Cast Iron",
                "Black", false, "Knurled",
                9000, "Extra Large", "Bodybuilding", 15,
                "Hex", "Matte", true,
                "Germany", "4 Years", "Heavy",
                "MP-30KG", "PowerStore",
                55.0, "DB009");

        DumbBell dumbBell10 = new DumbBell("QuickFit", 4.0, "Steel",
                "Pink", true, "Rubber Grip",
                1000, "Small", "Women Fitness", 70,
                "Round", "Rubber", true,
                "India", "1 Year", "Adjustable",
                "QF-4KG", "FitSupply",
                28.0, "DB010");

        dumbBell1.getDumbBellInfo();
        dumbBell2.getDumbBellInfo();
        dumbBell3.getDumbBellInfo();
        dumbBell4.getDumbBellInfo();
        dumbBell5.getDumbBellInfo();
        dumbBell6.getDumbBellInfo();
        dumbBell7.getDumbBellInfo();
        dumbBell8.getDumbBellInfo();
        dumbBell9.getDumbBellInfo();
        dumbBell10.getDumbBellInfo();
    }
}