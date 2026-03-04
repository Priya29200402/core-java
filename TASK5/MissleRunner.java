class MissleRunner{
    public static void main(String[] args){

        Missle missle1 = new Missle();
        Missle missle2 = new Missle();

        System.out.println("====================");
        missle1.launch();
        missle1.target();
        missle2.arm();
        missle2.disarm();
        missle1.activate();
        missle1.deactivate();
        missle2.navigate();
        missle1.accelerate();
        missle2.selfDestruct();
        missle1.test();

        System.out.println("====================");

        Missle.getType();
        Missle.getRange();
        Missle.getManufacturer();
        Missle.getFuelType();
        Missle.getCountry();
    }
}