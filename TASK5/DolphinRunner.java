class DolphinRunner{
    public static void main(String[] args){

        Dolphin dolphin1 = new Dolphin();
        Dolphin dolphin2 = new Dolphin();

        System.out.println("====================");
        dolphin1.swim();
        dolphin1.jump();
        dolphin2.dive();
        dolphin2.hunt();
        dolphin1.eat();
        dolphin1.sleep();
        dolphin2.communicate();
        dolphin1.play();
        dolphin2.breathe();
        dolphin1.migrate();

        System.out.println("====================");

        Dolphin.getSpecies();
        Dolphin.getHabitat();
        Dolphin.getLifeSpan();
        Dolphin.getIntelligenceLevel();
        Dolphin.getConservationStatus();
    }
}