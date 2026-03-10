class Painter{

    String[] brands;
    Paint[] paints;

    Painter(String[] brands, Paint[] paints){
        this.brands = brands;
        this.paints = paints;
    }

    void printInfo(){

        System.out.println("Executing printInfo in Painter...");

        if (this.brands != null){
            System.out.println("Brands length: " + this.brands.length);

            for (String brand : this.brands){
                System.out.println("Paint brand: "+brand);
            }
        }

        if (this.paints != null){
            System.out.println("Paints length: " + this.paints.length);

            for (Paint paint : this.paints){
                if (paint != null) {
                    paint.getInfo();
                }
            }
        }
    }
}