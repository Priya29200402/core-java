class Balloon{
    String color;
    double price;
    boolean flying;

    Balloon(){
        System.out.println("Creating Balloon constructor...");
    }

    void inflate(){
        System.out.println("Executing inflate in Balloon");
    }

    void releaseAir(){
        System.out.println("Executing releaseAir in Balloon...");
    }
}