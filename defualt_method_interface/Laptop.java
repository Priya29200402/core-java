package inner;

public class Laptop implements Electronic {
    public static void main(String[] args) {
        Electronic electronic = new Laptop();
        electronic.switchOn();
        electronic.switchOff();
        electronic.displayInfo();

    }

    @Override
    public void switchOn() {
        System.out.println("Laptop is switching on");
    }

    @Override
    public void switchOff() {
        System.out.println("Laptop is switching off");
    }

    @Override
    public void displayInfo(){
        System.out.println("Brand:"+ brand);
        System.out.println("Price:"+ price);
        System.out.println("Length:"+ lenght);
    }
}
