package inner;

public interface Grocery {
    String name="Dmart";
    String location="Bangalore";
    int numberOfItems=1000;

    void openStore();
    void closeStore();
    default void displayInfo(){
        System.out.println("Dmart is a popular Supermarket");
    }

     static void getStoreDetails(){
        System.out.println("Store Name: Dmart, Location: Bangalore, Number of Items: 1000");
    }
}
