package inner;

public interface Cloth {
    String type="Shirt";
    String material="Cotton";
    String color="Blue";

    void wear();
    void wash();
    default void displayInfo(){
        System.out.println("Cloth Type:"+ type);
        System.out.println("Material:"+ material);
        System.out.println("Color:"+ color);
    }

     static void getClothDetails(){
        System.out.println("Cloth Type: Shirt, Material: Cotton, Color: Blue");
    }
}
