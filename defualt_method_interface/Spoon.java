package inner;

public class Spoon implements Utensil {
    public static void main(String[] args) {
        Utensil utensil = new Spoon();
        utensil.use();
        utensil.clean();
        utensil.displayInfo();
    }
    @Override
    public void use() {
        System.out.println("Using the spoon to eat.");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the spoon with soap and water.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Utensil Type:" + type);
        System.out.println("Material:" + material);
        System.out.println("Price:" + price);
    }
}
