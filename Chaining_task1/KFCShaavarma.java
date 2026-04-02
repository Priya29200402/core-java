class KFCShawarma extends Shawarma {

    KFCShawarma(String type, String size, double price) {
        super(type,size,price);
    }

    KFCShawarma() {
        super("Chicken","Large",198);
    }

    KFCShawarma(String type) {
        super(type,"Medium", 180);
    }
}