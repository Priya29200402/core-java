class DiabetesRunner{

    public static void main(String[] args) {

        Diabetes diabetes1 = new Diabetes("Type 1", "Rahul", 18, "Male",
                250.5, true, "2022-05-10", "Dr. Sharma", "City Hospital",
                "Frequent urination", "Insulin", 60.0,
                170.0, "O+", true,
                "Low sugar diet", "Morning walk",
                "India", "P001", "Under Treatment");

        Diabetes diabetes2 = new Diabetes("Type 2", "Anita", 45, "Female",
                180.2, false, "2021-03-15", "Dr. Mehta", "Apollo Hospital",
                "Fatigue", "Metformin", 70.0,
                160.0, "A+", false,
                "Balanced diet", "Yoga",
                "India", "P002", "Stable");

        Diabetes diabetes3 = new Diabetes("Gestational", "Priya", 30, "Female",
                160.0, false, "2023-07-20", "Dr. Reddy", "Mother Care",
                "High sugar", "Diet Control", 65.0,
                158.0, "B+", false,
                "Controlled carbs", "Light exercise",
                "India", "P003", "Recovered");

        Diabetes diabetes4 = new Diabetes("Type 2", "John", 50, "Male",
                210.4, true, "2020-09-12", "Dr. Smith", "Global Hospital",
                "Blurred vision", "Insulin", 85.0,
                175.0, "AB+", true,
                "Strict diet", "Gym",
                "USA", "P004", "Critical");

        Diabetes diabetes5 = new Diabetes("Type 1", "Sara", 22, "Female",
                240.3, true, "2022-01-05", "Dr. Khan", "Metro Hospital",
                "Weight loss", "Insulin", 55.0,
                165.0, "O-", true,
                "High protein", "Running",
                "UK", "P005", "Under Treatment");

        Diabetes diabetes6 = new Diabetes("Type 2", "Amit", 38, "Male",
                190.6, false, "2019-11-18", "Dr. Patel", "Sunrise Hospital",
                "Increased thirst", "Metformin", 78.0,
                172.0, "B-", false,
                "Low carb", "Cycling",
                "India", "P006", "Stable");

        Diabetes diabetes7 = new Diabetes("Type 2", "Lakshmi", 60, "Female",
                220.1, true, "2018-06-30", "Dr. Rao", "Care Hospital",
                "Slow healing wounds", "Insulin", 68.0,
                155.0, "A-", true,
                "Diabetic diet", "Walking",
                "India", "P007", "Under Observation");

        Diabetes diabetes8 = new Diabetes("Type 1", "Kevin", 15, "Male",
                260.7, true, "2023-02-14", "Dr. Wilson", "Children Hospital",
                "Extreme hunger", "Insulin", 50.0,
                162.0, "O+", false,
                "Balanced diet", "Sports",
                "Canada", "P008", "Under Treatment");

        Diabetes diabetes9 = new Diabetes("Type 2", "Maria", 48, "Female",
                175.9, false, "2020-12-25", "Dr. Garcia", "Health Clinic",
                "Tiredness", "Metformin", 72.0,
                168.0, "AB-", false,
                "Low sugar", "Yoga",
                "Spain", "P009", "Stable");

        Diabetes diabetes10 = new Diabetes("Type 2", "Ramesh", 55, "Male",
                230.8, true, "2017-08-09", "Dr. Iyer", "LifeCare Hospital",
                "Blurred vision", "Insulin", 82.0,
                174.0, "A+", true,
                "Strict diabetic plan", "Morning walk",
                "India", "P010", "Critical");

        diabetes1.getDiabetesInfo();
        diabetes2.getDiabetesInfo();
        diabetes3.getDiabetesInfo();
        diabetes4.getDiabetesInfo();
        diabetes5.getDiabetesInfo();
        diabetes6.getDiabetesInfo();
        diabetes7.getDiabetesInfo();
        diabetes8.getDiabetesInfo();
        diabetes9.getDiabetesInfo();
        diabetes10.getDiabetesInfo();
    }
}