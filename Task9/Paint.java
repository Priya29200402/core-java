class Paint {

    String color;
    int price;

    Paint(String color, int price) {
        this.color = color;
        this.price = price;
    }

    void getInfo() {
        System.out.println("Paint color: " + this.color);
        System.out.println("Paint price: " + this.price);
    }
}