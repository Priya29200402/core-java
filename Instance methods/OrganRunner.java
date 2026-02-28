class OrganRunner{

    public static void main(String[] args){

        Organ organ1 = new Organ("Heart", "Chest", 0.3, "Red",
                "Pump Blood", "Circulatory", true,
                "Normal", "O+", "Ramesh",
                35, "Male", "City Hospital", "Dr. Sharma",
                "India", "2024-01-10", true,
                "Vital Organ", "OR001", "Healthy condition");

        Organ organ2 = new Organ("Kidney", "Lower Back", 0.15, "Dark Red",
                "Filter Blood", "Excretory", true,
                "Stable", "A+", "Anita",
                28, "Female", "Apollo Hospital", "Dr. Mehta",
                "India", "2023-05-12", true,
                "Vital Organ", "OR002", "Transplant successful");

        Organ organ3 = new Organ("Liver", "Upper Abdomen", 1.5, "Brown",
                "Detoxification", "Digestive", true,
                "Normal", "B+", "John",
                40, "Male", "Global Hospital", "Dr. Smith",
                "USA", "2022-11-20", true,
                "Vital Organ", "OR003", "Functioning well");

        Organ organ4 = new Organ("Lung", "Chest", 1.0, "Pink",
                "Breathing", "Respiratory", true,
                "Good", "AB+", "Sara",
                30, "Female", "Metro Hospital", "Dr. Khan",
                "UK", "2023-03-18", true,
                "Vital Organ", "OR004", "Healthy lungs");

        Organ organ5 = new Organ("Pancreas", "Abdomen", 0.08, "Light Pink",
                "Insulin Production", "Digestive", true,
                "Normal", "O-", "Amit",
                45, "Male", "Sunrise Hospital", "Dr. Patel",
                "India", "2021-09-14", true,
                "Gland", "OR005", "Stable");

        Organ organ6 = new Organ("Eye", "Head", 0.007, "Brown",
                "Vision", "Sensory", false,
                "Normal", "A-", "Lakshmi",
                25, "Female", "Care Hospital", "Dr. Rao",
                "India", "2024-06-01", true,
                "Sense Organ", "OR006", "Clear vision");

        Organ organ7 = new Organ("Brain", "Head", 1.4, "Pink",
                "Control Body", "Nervous", true,
                "Excellent", "B-", "Kevin",
                20, "Male", "Neuro Hospital", "Dr. Wilson",
                "Canada", "2020-12-22", true,
                "Vital Organ", "OR007", "Highly active");

        Organ organ8 = new Organ("Stomach", "Abdomen", 0.5, "Pink",
                "Digestion", "Digestive", false,
                "Normal", "O+", "Maria",
                32, "Female", "Health Clinic", "Dr. Garcia",
                "Spain", "2022-07-30", true,
                "Digestive Organ", "OR008", "Working properly");

        Organ organ9 = new Organ("Skin", "Whole Body", 3.0, "Brown",
                "Protection", "Integumentary", false,
                "Healthy", "AB-", "Ravi",
                29, "Male", "LifeCare Hospital", "Dr. Iyer",
                "India", "2023-10-10", true,
                "Protective Organ", "OR009", "No issues");

        Organ organ10 = new Organ("Spleen", "Upper Abdomen", 0.2, "Purple",
                "Filter Blood", "Immune", false,
                "Stable", "A+", "Priya",
                34, "Female", "Mother Care", "Dr. Reddy",
                "India", "2021-04-05", true,
                "Immune Organ", "OR010", "Normal size");

        organ1.getOrganInfo();
        organ2.getOrganInfo();
        organ3.getOrganInfo();
        organ4.getOrganInfo();
        organ5.getOrganInfo();
        organ6.getOrganInfo();
        organ7.getOrganInfo();
        organ8.getOrganInfo();
        organ9.getOrganInfo();
        organ10.getOrganInfo();
    }
}