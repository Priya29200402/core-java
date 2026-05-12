package inner;

public class Dmart implements Grocery {
    public static void main(String[] args) {
        Grocery grocery = new Dmart();
        grocery.openStore();
        grocery.closeStore();
        grocery.displayInfo();
    }
    @Override
    public void openStore() {
        System.out.println("Dmart is opening the store");
    }

    @Override
    public void closeStore() {
        System.out.println("Dmart is closing the store");
    }

     @Override
    public void displayInfo(){
        System.out.println("Store Name:"+ name);
        System.out.println("Location:"+ location);
        System.out.println("Number of Items:"+ numberOfItems);
    }

}
