class Brain{

    String ownerName;
    double weight;
    String color;
    String hemisphere;
    int iqLevel;
    boolean healthy;
    String function;
    String memoryType;
    String nervousSystemType;
    String condition;
    String doctor;
    String hospital;
    String country;
    String bloodSupply;
    boolean active;
    String category;
    String researchCenter;
    String scanType;
    String code;
    String remarks;

    Brain(String ownerName, double weight, String color,
          String hemisphere, int iqLevel, boolean healthy,
          String function, String memoryType,
          String nervousSystemType, String condition,
          String doctor, String hospital, String country,
          String bloodSupply, boolean active,
          String category, String researchCenter,
          String scanType, String code, String remarks) {

        this.ownerName = ownerName;
        this.weight = weight;
        this.color = color;
        this.hemisphere = hemisphere;
        this.iqLevel = iqLevel;
        this.healthy = healthy;
        this.function = function;
        this.memoryType = memoryType;
        this.nervousSystemType = nervousSystemType;
        this.condition = condition;
        this.doctor = doctor;
        this.hospital = hospital;
        this.country = country;
        this.bloodSupply = bloodSupply;
        this.active = active;
        this.category = category;
        this.researchCenter = researchCenter;
        this.scanType = scanType;
        this.code = code;
        this.remarks = remarks;
    }

    void getBrain(){
        System.out.println("Owner: " + ownerName);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Hemisphere: " + hemisphere);
        System.out.println("IQ Level: " + iqLevel);
        System.out.println("Healthy: " + healthy);
        System.out.println("Function: " + function);
        System.out.println("Memory Type: " + memoryType);
        System.out.println("Nervous System: " + nervousSystemType);
        System.out.println("Condition: " + condition);
        System.out.println("Doctor: " + doctor);
        System.out.println("Hospital: " + hospital);
        System.out.println("Country: " + country);
        System.out.println("Blood Supply: " + bloodSupply);
        System.out.println("Active: " + active);
        System.out.println("Category: " + category);
        System.out.println("Research Center: " + researchCenter);
        System.out.println("Scan Type: " + scanType);
        System.out.println("Code: " + code);
        System.out.println("Remarks: " + remarks);
    }
}