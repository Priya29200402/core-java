class Office{

    String name;
    String location;
    String city;
    String state;
    int employees;
    String manager;
    String department;
    boolean acAvailable;
    boolean wifiAvailable;
    String buildingType;
    double area;
    String country;
    String contactNumber;
    String email;
    String category;
    int cabins;
    int floors;
    String code;
    String openingTime;
    String closingTime;

    Office(String name, String location, String city, String state,
           int employees, String manager, String department,
           boolean acAvailable, boolean wifiAvailable,
           String buildingType, double area, String country,
           String contactNumber, String email, String category,
           int cabins, int floors, String code,
           String openingTime, String closingTime) {

        this.name = name;
        this.location = location;
        this.city = city;
        this.state = state;
        this.employees = employees;
        this.manager = manager;
        this.department = department;
        this.acAvailable = acAvailable;
        this.wifiAvailable = wifiAvailable;
        this.buildingType = buildingType;
        this.area = area;
        this.country = country;
        this.contactNumber = contactNumber;
        this.email = email;
        this.category = category;
        this.cabins = cabins;
        this.floors = floors;
        this.code = code;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    void getOfficeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Employees: " + employees);
        System.out.println("Manager: " + manager);
        System.out.println("Department: " + department);
        System.out.println("AC Available: " + acAvailable);
        System.out.println("WiFi Available: " + wifiAvailable);
        System.out.println("Building Type: " + buildingType);
        System.out.println("Area: " + area);
        System.out.println("Country: " + country);
        System.out.println("Contact: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Category: " + category);
        System.out.println("Cabins: " + cabins);
        System.out.println("Floors: " + floors);
        System.out.println("Code: " + code);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
    }
}