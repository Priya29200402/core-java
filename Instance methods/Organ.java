class Organ{

    String name;
    String bodyPart;
    double weight;
    String color;
    String function;
    String system;
    boolean vital;
    String condition;
    String bloodType;
    String donorName;
    int age;
    String gender;
    String hospital;
    String doctor;
    String country;
    String transplantDate;
    boolean healthy;
    String category;
    String code;
    String remarks;

    Organ(String name, String bodyPart, double weight, String color,
          String function, String system, boolean vital,
          String condition, String bloodType, String donorName,
          int age, String gender, String hospital, String doctor,
          String country, String transplantDate, boolean healthy,
          String category, String code, String remarks) {

        this.name = name;
        this.bodyPart = bodyPart;
        this.weight = weight;
        this.color = color;
        this.function = function;
        this.system = system;
        this.vital = vital;
        this.condition = condition;
        this.bloodType = bloodType;
        this.donorName = donorName;
        this.age = age;
        this.gender = gender;
        this.hospital = hospital;
        this.doctor = doctor;
        this.country = country;
        this.transplantDate = transplantDate;
        this.healthy = healthy;
        this.category = category;
        this.code = code;
        this.remarks = remarks;
    }

    void getOrganInfo() {
        System.out.println("Name: " + name);
        System.out.println("Body Part: " + bodyPart);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Function: " + function);
        System.out.println("System: " + system);
        System.out.println("Vital: " + vital);
        System.out.println("Condition: " + condition);
        System.out.println("Blood Type: " + bloodType);
        System.out.println("Donor Name: " + donorName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Hospital: " + hospital);
        System.out.println("Doctor: " + doctor);
        System.out.println("Country: " + country);
        System.out.println("Transplant Date: " + transplantDate);
        System.out.println("Healthy: " + healthy);
        System.out.println("Category: " + category);
        System.out.println("Code: " + code);
        System.out.println("Remarks: " + remarks);
    }
}