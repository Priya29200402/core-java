class PVR{

    String name;
    String location;
    String city;
    String state;
    int screens;
    int totalSeats;
    boolean imaxAvailable;
    boolean foodCourt;
    String managerName;
    double ticketPrice;
    String contactNumber;
    String email;
    String openingTime;
    String closingTime;
    boolean parkingAvailable;
    String category;
    String owner;
    int staffCount;
    String code;
    String country;

    PVR(String name, String location, String city, String state,
        int screens, int totalSeats, boolean imaxAvailable,
        boolean foodCourt, String managerName, double ticketPrice,
        String contactNumber, String email, String openingTime,
        String closingTime, boolean parkingAvailable,
        String category, String owner, int staffCount,
        String code, String country) {

        this.name = name;
        this.location = location;
        this.city = city;
        this.state = state;
        this.screens = screens;
        this.totalSeats = totalSeats;
        this.imaxAvailable = imaxAvailable;
        this.foodCourt = foodCourt;
        this.managerName = managerName;
        this.ticketPrice = ticketPrice;
        this.contactNumber = contactNumber;
        this.email = email;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.parkingAvailable = parkingAvailable;
        this.category = category;
        this.owner = owner;
        this.staffCount = staffCount;
        this.code = code;
        this.country = country;
    }

    void getPVRInfo(){
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Screens: " + screens);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("IMAX Available: " + imaxAvailable);
        System.out.println("Food Court: " + foodCourt);
        System.out.println("Manager: " + managerName);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Contact: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Parking: " + parkingAvailable);
        System.out.println("Category: " + category);
        System.out.println("Owner: " + owner);
        System.out.println("Staff Count: " + staffCount);
        System.out.println("Code: " + code);
        System.out.println("Country: " + country);
    }
}