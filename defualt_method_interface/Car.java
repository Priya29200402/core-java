package inner;

public class Car implements Vehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();
        vehicle.displayInfo();
    }

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

     @Override
    public void displayInfo(){
        System.out.println("Type:"+ type);
        System.out.println("Brand:"+ brand);
        System.out.println("MaxSpeed:"+ maxSpeed);
     }
}
