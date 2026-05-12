package inner;

public interface Vehicle {
    String type="Car";
    String brand="Toyota";
    int maxSpeed=180;

    void start();
    void stop();
    default void displayInfo(){
        System.out.println("Vehicle Type:"+ type);
        System.out.println("Brand:"+ brand);
        System.out.println("Max Speed:"+ maxSpeed);
    }

     static void getVehicleDetails(){
        System.out.println("Vehicle Type: Car, Brand: Toyota, Max Speed: 180 km/h");
    }
}
