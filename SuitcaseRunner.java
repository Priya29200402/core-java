class SuitcaseRunner {

    public static void main(String[] args) {

        System.out.println("Brand Name:");
        String brand = Suitcase.brand();
        System.out.println(brand);

        System.out.println("Capacity:");
        int capacity = Suitcase.capacity();
        System.out.println(capacity);

        System.out.println("Has Wheels:");
        boolean wheels = Suitcase.hasWheels();
        System.out.println(wheels);

        System.out.println("Color:");
        String color = Suitcase.color();
        System.out.println(color);

        System.out.println("Price:");
        double price = Suitcase.price();
        System.out.println(price);
    }
}
