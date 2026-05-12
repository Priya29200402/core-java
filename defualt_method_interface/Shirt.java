package inner;

public class Shirt implements Cloth {
    public static void main(String[] args) {
        Cloth cloth = new Shirt();
        cloth.wear();
        cloth.wash();
        cloth.displayInfo();
         Cloth.getClothDetails();
    }
    @Override
    public void wear() {
        System.out.println("Wearing the shirt");
    }

    @Override
    public void wash() {
        System.out.println("Washing the shirt");
    }

     @Override
    public void displayInfo(){
        System.out.println("Cloth Type:"+ type);
        System.out.println("Material:"+ material);
        System.out.println("Color:"+ color);
    }
}
