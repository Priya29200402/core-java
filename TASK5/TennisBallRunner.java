class TennisBallRunner{
    public static void main(String[] args){

        TennisBall ball1 = new TennisBall();
        TennisBall ball2 = new TennisBall();

        System.out.println("====================");
        ball1.bounce();
        ball1.roll();
        ball2.hit();
        ball2.spin();
        ball1.serve();
        ball1.smash();
        ball2.store();
        ball1.clean();
        ball2.inflate();
        ball1.deflate();

        System.out.println("====================");

        TennisBall.getBrand();
        TennisBall.getColor();
        TennisBall.getWeight();
        TennisBall.getMaterial();
        TennisBall.getUsage();
    }
}