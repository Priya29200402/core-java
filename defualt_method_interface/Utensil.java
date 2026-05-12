package inner;

public interface Utensil {
    String type="Spoon";
    String material="Stainless Steel";
    double price=10.5;

    void use();
    void clean();
    default void displayInfo(){
        System.out.println("Utensil Type:"+ type);
        System.out.println("Material:"+ material);
        System.out.println("Price:"+ price);
    }

     static void getUtensilDetails(){
        System.out.println("Utensil Type: Spoon, Material: Stainless Steel, Price: 10.5");
    }
}
