package inner;

public interface Electronic{

    String brand = "HP";
    double price = 490000;
    double lenght = 15.6;

    void switchOn();
    void switchOff();
    default void displayInfo(){
        System.out.println("This is an electronic device.");
    }

    static void getBrand(){
        System.out.println("Brand: HP Laptop");
    }

}
