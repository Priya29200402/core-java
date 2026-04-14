class PVRRunner{
    public static void main(String[] args){

        PVR pvr1 = new PVR("PVR Phoenix Mall", "Whitefield", "Bangalore", "Karnataka",
                10, 1500, true,
                true, "Ramesh Kumar", 350.0,
                "9876543210", "phoenix@pvr.com", "09:00 AM",
                "11:30 PM", true,
                "Multiplex", "PVR Ltd", 120,
                "PVR001", "India");

        PVR pvr2 = new PVR("PVR Orion Mall", "Rajajinagar", "Bangalore", "Karnataka",
                8, 1200, false,
                true, "Suresh Rao", 300.0,
                "9876500001", "orion@pvr.com", "10:00 AM",
                "11:00 PM", true,
                "Multiplex", "PVR Ltd", 95,
                "PVR002", "India");

        PVR pvr3 = new PVR("PVR Select Citywalk", "Saket", "Delhi", "Delhi",
                12, 2000, true,
                true, "Anita Sharma", 400.0,
                "9811111111", "select@pvr.com", "09:30 AM",
                "12:00 AM", true,
                "Luxury", "PVR Ltd", 150,
                "PVR003", "India");

        PVR pvr4 = new PVR("PVR Forum Mall", "Koramangala", "Bangalore", "Karnataka",
                7, 1000, false,
                true, "Vijay Patel", 280.0,
                "9822222222", "forum@pvr.com", "10:00 AM",
                "10:45 PM", true,
                "Standard", "PVR Ltd", 80,
                "PVR004", "India");

        PVR pvr5 = new PVR("PVR Express Avenue", "Royapettah", "Chennai", "Tamil Nadu",
                9, 1300, true,
                true, "Lakshmi Iyer", 320.0,
                "9833333333", "express@pvr.com", "09:00 AM",
                "11:15 PM", true,
                "Multiplex", "PVR Ltd", 110,
                "PVR005", "India");

        PVR pvr6 = new PVR("PVR Elante Mall", "Industrial Area", "Chandigarh", "Punjab",
                6, 900, false,
                true, "Amit Singh", 250.0,
                "9844444444", "elante@pvr.com", "10:00 AM",
                "11:00 PM", true,
                "Standard", "PVR Ltd", 70,
                "PVR006", "India");

        PVR pvr7 = new PVR("PVR High Street", "Viman Nagar", "Pune", "Maharashtra",
                5, 800, false,
                true, "Neha Joshi", 270.0,
                "9855555555", "highstreet@pvr.com", "09:30 AM",
                "10:30 PM", true,
                "Mini Plex", "PVR Ltd", 60,
                "PVR007", "India");

        PVR pvr8 = new PVR("PVR Lulu Mall", "Edappally", "Kochi", "Kerala",
                11, 1800, true,
                true, "Rahul Menon", 340.0,
                "9866666666", "lulu@pvr.com", "09:00 AM",
                "11:45 PM", true,
                "Luxury", "PVR Ltd", 140,
                "PVR008", "India");

        PVR pvr9 = new PVR("PVR Inorbit Mall", "Malad", "Mumbai", "Maharashtra",
                8, 1250, true,
                true, "Priya Desai", 380.0,
                "9877777777", "inorbit@pvr.com", "09:30 AM",
                "11:30 PM", true,
                "Multiplex", "PVR Ltd", 100,
                "PVR009", "India");

        PVR pvr10 = new PVR("PVR Pacific Mall", "Subhash Nagar", "Delhi", "Delhi",
                10, 1600, true,
                true, "Karan Mehta", 360.0,
                "9888888888", "pacific@pvr.com", "09:00 AM",
                "12:00 AM", true,
                "Premium", "PVR Ltd", 130,
                "PVR010", "India");

        pvr1.getPVRInfo();
        System.out.println("----------------------");
        pvr2.getPVRInfo();
        System.out.println("----------------------");
        pvr3.getPVRInfo();
        System.out.println("----------------------");
        pvr4.getPVRInfo();
        System.out.println("----------------------");
        pvr5.getPVRInfo();
        System.out.println("----------------------");
        pvr6.getPVRInfo();
        System.out.println("----------------------");
        pvr7.getPVRInfo();
        System.out.println("----------------------");
        pvr8.getPVRInfo();
        System.out.println("----------------------");
        pvr9.getPVRInfo();
        System.out.println("----------------------");
        pvr10.getPVRInfo();
    }
}