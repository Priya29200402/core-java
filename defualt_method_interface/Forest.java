package inner;

public interface Forest {
    String name="Amazon Rainforest";
    double areaInSquareKm=5500000;
    String location="South America";

    void explore();
    void conserve();
    default void displayInfo(){
        System.out.println("Forest Name:"+ name);
        System.out.println("Area in Square Km:"+ areaInSquareKm);
        System.out.println("Location:"+ location);
    }

     static void getForestDetails(){
        System.out.println("Forest Name: Amazon Rainforest, Area: 5.5 million square km, Location: South America");
    }
}
