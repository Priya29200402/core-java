class Diabetes{

    String type;
    String patientName;
    int age;
    String gender;
    double sugarLevel;
    boolean insulinDependent;
    String diagnosisDate;
    String doctorName;
    String hospital;
    String symptoms;
    String medication;
    double weight;
    double height;
    String bloodGroup;
    boolean hereditary;
    String dietPlan;
    String exercisePlan;
    String country;
    String patientId;
    String status;

    Diabetes(String type, String patientName, int age, String gender,
             double sugarLevel, boolean insulinDependent,
             String diagnosisDate, String doctorName, String hospital,
             String symptoms, String medication, double weight,
             double height, String bloodGroup, boolean hereditary,
             String dietPlan, String exercisePlan,
             String country, String patientId, String status) {

        this.type = type;
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.sugarLevel = sugarLevel;
        this.insulinDependent = insulinDependent;
        this.diagnosisDate = diagnosisDate;
        this.doctorName = doctorName;
        this.hospital = hospital;
        this.symptoms = symptoms;
        this.medication = medication;
        this.weight = weight;
        this.height = height;
        this.bloodGroup = bloodGroup;
        this.hereditary = hereditary;
        this.dietPlan = dietPlan;
        this.exercisePlan = exercisePlan;
        this.country = country;
        this.patientId = patientId;
        this.status = status;
    }

    void getDiabetesInfo() {
        System.out.println("Type: " + type);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Sugar Level: " + sugarLevel);
        System.out.println("Insulin Dependent: " + insulinDependent);
        System.out.println("Diagnosis Date: " + diagnosisDate);
        System.out.println("Doctor: " + doctorName);
        System.out.println("Hospital: " + hospital);
        System.out.println("Symptoms: " + symptoms);
        System.out.println("Medication: " + medication);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Hereditary: " + hereditary);
        System.out.println("Diet Plan: " + dietPlan);
        System.out.println("Exercise Plan: " + exercisePlan);
        System.out.println("Country: " + country);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Status: " + status);
    }
}