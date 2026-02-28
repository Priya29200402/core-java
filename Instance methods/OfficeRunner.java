class OfficeRunner {
    public static void main(String[] args) {

        Office office1 = new Office("Tech Park HQ", "Whitefield", "Bangalore", "Karnataka",
                250, "Anita Sharma", "IT",
                true, true, "Commercial", 15000.5, "India",
                "9876543210", "hq@techpark.com", "Corporate",
                40, 5, "O001", "9:00 AM", "6:00 PM");

        Office office2 = new Office("Finance Hub", "MG Road", "Bangalore", "Karnataka",
                120, "Rohit Verma", "Finance",
                true, true, "Commercial", 8000.0, "India",
                "9123456780", "finance@hub.com", "Private",
                20, 3, "O002", "9:30 AM", "5:30 PM");

        Office office3 = new Office("HealthCare Admin", "Banjara Hills", "Hyderabad", "Telangana",
                90, "Sneha Reddy", "Administration",
                true, true, "Corporate", 6000.0, "India",
                "9012345678", "admin@healthcare.com", "Healthcare",
                15, 2, "O003", "8:30 AM", "4:30 PM");

        Office office4 = new Office("EduWorld Office", "Anna Nagar", "Chennai", "Tamil Nadu",
                60, "Karthik Iyer", "Education",
                true, true, "Institutional", 5000.0, "India",
                "9988776655", "info@eduworld.com", "Educational",
                10, 2, "O004", "9:00 AM", "5:00 PM");

        Office office5 = new Office("StartUp Space", "Hinjewadi", "Pune", "Maharashtra",
                45, "Priya Nair", "Development",
                true, true, "IT Park", 3500.0, "India",
                "9876501234", "contact@startup.com", "Startup",
                8, 1, "O005", "10:00 AM", "7:00 PM");

        Office office6 = new Office("Legal Associates", "Connaught Place", "Delhi", "Delhi",
                30, "Arjun Mehta", "Legal",
                true, true, "Commercial", 4000.0, "India",
                "9090909090", "legal@assoc.com", "Law Firm",
                12, 4, "O006", "9:00 AM", "6:00 PM");

        Office office7 = new Office("Marketing Masters", "Salt Lake", "Kolkata", "West Bengal",
                75, "Neha Kapoor", "Marketing",
                true, true, "Corporate", 5500.0, "India",
                "9345678901", "marketing@masters.com", "Agency",
                18, 3, "O007", "9:30 AM", "6:30 PM");

        Office office8 = new Office("Manufacturing Unit Office", "Peenya", "Bangalore", "Karnataka",
                110, "Suresh Rao", "Operations",
                true, false, "Industrial", 9000.0, "India",
                "9456123789", "ops@manufacture.com", "Manufacturing",
                25, 2, "O008", "8:00 AM", "5:00 PM");

        Office office9 = new Office("Research Center", "Gachibowli", "Hyderabad", "Telangana",
                140, "Divya Menon", "R&D",
                true, true, "Research Facility", 10000.0, "India",
                "9765432109", "research@center.com", "Research",
                30, 4, "O009", "9:00 AM", "6:00 PM");

        Office office10 = new Office("Customer Support Center", "Andheri", "Mumbai", "Maharashtra",
                200, "Vikram Singh", "Support",
                true, true, "Commercial", 12000.0, "India",
                "9898989898", "support@center.com", "Service",
                35, 5, "O010", "24 Hours", "24 Hours");

        
        office1.getOfficeInfo();
		System.out.println("-----------------------");
		office2.getOfficeInfo();
		System.out.println("-----------------------");
		office3.getOfficeInfo();
		System.out.println("-----------------------");
		office4.getOfficeInfo();
		System.out.println("-----------------------");
		office5.getOfficeInfo();
		System.out.println("-----------------------");
		office6.getOfficeInfo();
		System.out.println("-----------------------");
		office7.getOfficeInfo();
		System.out.println("-----------------------");
		office8.getOfficeInfo();
		System.out.println("-----------------------");
		office9.getOfficeInfo();
		System.out.println("-----------------------");
		office10.getOfficeInfo();
		System.out.println("-----------------------");
    }
}