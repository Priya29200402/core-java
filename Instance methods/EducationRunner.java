class EducationRunner{
    public static void main(String[] args){

        Education edu1 = new Education("Tech University", "Computer Science", "B.Tech",
                4, 150000.0, "English", "Bangalore",
                true, true, "NAAC A+", "VTU",
                120, "12th PCM", "KCET",
                "Engineering", "AI, ML, Data Structures",
                "Dr. Rajesh Kumar", "www.techuniv.com",
                "info@techuniv.com", "E001");

        Education edu2 = new Education("Global Business School", "MBA", "Postgraduate",
                2, 250000.0, "English", "Mumbai",
                true, true, "AICTE", "Mumbai University",
                60, "Any Degree", "CAT",
                "Management", "Finance, HR, Marketing",
                "Dr. Neha Sharma", "www.gbsmba.com",
                "contact@gbsmba.com", "E002");

        Education edu3 = new Education("National Medical College", "MBBS", "Undergraduate",
                5, 500000.0, "English", "Delhi",
                false, true, "MCI", "Delhi University",
                100, "12th PCB", "NEET",
                "Medical", "Anatomy, Physiology",
                "Dr. Arvind Mehta", "www.nmc.edu",
                "admin@nmc.edu", "E003");

        Education edu4 = new Education("Creative Arts Institute", "Fine Arts", "BFA",
                3, 120000.0, "English", "Chennai",
                true, false, "UGC", "Madras University",
                40, "12th Pass", "Merit",
                "Arts", "Painting, Sculpture",
                "Prof. Latha Iyer", "www.caiarts.com",
                "info@caiarts.com", "E004");

        Education edu5 = new Education("Law Academy", "LLB", "Undergraduate",
                3, 180000.0, "English", "Hyderabad",
                true, true, "BCI", "Osmania University",
                80, "Any Degree", "CLAT",
                "Law", "Criminal Law, Civil Law",
                "Dr. Suresh Rao", "www.lawacademy.com",
                "contact@lawacademy.com", "E005");

        Education edu6 = new Education("Science College", "B.Sc Physics", "Undergraduate",
                3, 90000.0, "English", "Pune",
                true, false, "NAAC A", "Pune University",
                70, "12th PCM", "Merit",
                "Science", "Quantum Mechanics",
                "Dr. Kavita Joshi", "www.sciencecollege.com",
                "info@sciencecollege.com", "E006");

        Education edu7 = new Education("IT Institute", "Diploma in Software", "Diploma",
                1, 60000.0, "English", "Kolkata",
                true, true, "AICTE", "Autonomous",
                50, "12th Pass", "Entrance Test",
                "Technology", "Java, Python",
                "Mr. Amit Das", "www.itinstitute.com",
                "support@itinstitute.com", "E007");

        Education edu8 = new Education("Agriculture University", "B.Sc Agriculture", "Undergraduate",
                4, 140000.0, "English", "Coimbatore",
                false, true, "ICAR", "TNAU",
                90, "12th PCB", "State Exam",
                "Agriculture", "Crop Science",
                "Dr. Ramesh Iyer", "www.agriuniv.com",
                "info@agriuniv.com", "E008");

        Education edu9 = new Education("Design School", "Fashion Design", "Diploma",
                2, 110000.0, "English", "Jaipur",
                true, false, "UGC", "Rajasthan University",
                45, "12th Pass", "Merit",
                "Design", "Textile Design",
                "Ms. Pooja Verma", "www.designschool.com",
                "contact@designschool.com", "E009");

        Education edu10 = new Education("Open Learning Center", "BA English", "Undergraduate",
                3, 50000.0, "English", "Online",
                true, true, "UGC", "IGNOU",
                200, "12th Pass", "None",
                "Arts", "Literature, Grammar",
                "Dr. Anita Kapoor", "www.olc.com",
                "info@olc.com", "E010");

        edu1.getEducationInfo();
        System.out.println("-----------------------");
        edu2.getEducationInfo();
        System.out.println("-----------------------");
        edu3.getEducationInfo();
        System.out.println("-----------------------");
        edu4.getEducationInfo();
        System.out.println("-----------------------");
        edu5.getEducationInfo();
        System.out.println("-----------------------");
        edu6.getEducationInfo();
        System.out.println("-----------------------");
        edu7.getEducationInfo();
        System.out.println("-----------------------");
        edu8.getEducationInfo();
        System.out.println("-----------------------");
        edu9.getEducationInfo();
        System.out.println("-----------------------");
        edu10.getEducationInfo();
        System.out.println("-----------------------");
    }
}