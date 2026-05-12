package inner;

public interface Dairy {
    String name="Amul";
    String location="Gujarat";
    int numberOfProducts=500;

    void produceMilk();
    void produceButter();
    default void displayInfo(){
        System.out.println("Amul is a dairy brand in India");
    }

     static void getDairyDetails(){
        System.out.println("Dairy Name: Amul, Location: Gujarat, Number of Products: 500");
    }
}
