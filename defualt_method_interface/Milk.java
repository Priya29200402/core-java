package inner;

public class Milk implements Dairy {
    public static void main(String[] args) {
        Dairy dairy = new Milk();
        dairy.produceMilk();
        dairy.produceButter();
        dairy.displayInfo();
    }
    @Override
    public void produceMilk() {
        System.out.println("Producing milk");
    }

    @Override
    public void produceButter() {
        System.out.println("Producing butter");
    }

     @Override
    public void displayInfo(){
        System.out.println("Dairy Name:"+ name);
        System.out.println("Location:"+ location);
        System.out.println("Number of Products:"+ numberOfProducts);
    }
}
