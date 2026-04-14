class BrainRunner{

    public static void main(String[] args) {

        Brain brain1 = new Brain("Rahul", 1.4, "Pink",
                "Left", 110, true,
                "Thinking", "Short-term",
                "Central", "Normal",
                "Dr. Sharma", "City Hospital", "India",
                "Normal Flow", true,
                "Human", "NeuroLab",
                "MRI", "BR001", "Healthy brain");

        Brain brain2 = new Brain("Anita", 1.3, "Pink",
                "Right", 120, true,
                "Creativity", "Long-term",
                "Central", "Normal",
                "Dr. Mehta", "Apollo Hospital", "India",
                "Normal Flow", true,
                "Human", "BrainResearch Center",
                "CT Scan", "BR002", "Very active");

        Brain brain3 = new Brain("John", 1.5, "Light Pink",
                "Both", 130, true,
                "Problem Solving", "Photographic",
                "Central", "Excellent",
                "Dr. Smith", "Global Hospital", "USA",
                "Strong Flow", true,
                "Genius", "NeuroScience Lab",
                "MRI", "BR003", "High IQ");

        Brain brain4 = new Brain("Sara", 1.2, "Pink",
                "Left", 105, true,
                "Logical Thinking", "Short-term",
                "Central", "Normal",
                "Dr. Khan", "Metro Hospital", "UK",
                "Normal Flow", true,
                "Human", "MindLab",
                "EEG", "BR004", "Stable condition");

        Brain brain5 = new Brain("Amit", 1.45, "Pink",
                "Both", 115, false,
                "Memory Control", "Long-term",
                "Central", "Minor Issue",
                "Dr. Patel", "Sunrise Hospital", "India",
                "Moderate Flow", true,
                "Human", "BrainCare Center",
                "MRI", "BR005", "Under observation");

        Brain brain6 = new Brain("Lakshmi", 1.35, "Pink",
                "Right", 125, true,
                "Creativity", "Long-term",
                "Central", "Normal",
                "Dr. Rao", "Care Hospital", "India",
                "Normal Flow", true,
                "Human", "NeuroLab",
                "CT Scan", "BR006", "Good health");

        Brain brain7 = new Brain("Kevin", 1.25, "Light Pink",
                "Left", 100, true,
                "Basic Thinking", "Short-term",
                "Central", "Normal",
                "Dr. Wilson", "Children Hospital", "Canada",
                "Normal Flow", true,
                "Human", "ChildBrain Center",
                "EEG", "BR007", "Developing stage");

        Brain brain8 = new Brain("Maria", 1.38, "Pink",
                "Both", 118, true,
                "Analysis", "Long-term",
                "Central", "Normal",
                "Dr. Garcia", "Health Clinic", "Spain",
                "Normal Flow", true,
                "Human", "NeuroTech Lab",
                "MRI", "BR008", "Healthy");

        Brain brain9 = new Brain("Ramesh", 1.42, "Pink",
                "Right", 112, false,
                "Creative Thinking", "Short-term",
                "Central", "Stress",
                "Dr. Iyer", "LifeCare Hospital", "India",
                "Normal Flow", false,
                "Human", "MindResearch Lab",
                "CT Scan", "BR009", "Needs rest");

        Brain brain10 = new Brain("Priya", 1.33, "Pink",
                "Both", 135, true,
                "Advanced Thinking", "Photographic",
                "Central", "Excellent",
                "Dr. Reddy", "Mother Care", "India",
                "Strong Flow", true,
                "Genius", "Advanced Neuro Center",
                "MRI", "BR010", "Outstanding performance");

        brain1.getBrain();
        brain2.getBrain();
        brain3.getBrain();
        brain4.getBrain();
        brain5.getBrain();
        brain6.getBrain();
        brain7.getBrain();
        brain8.getBrain();
        brain9.getBrain();
        brain10.getBrain();
    }
}