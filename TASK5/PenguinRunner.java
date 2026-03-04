class PenguinRunner{
    public static void main(String[] args){

        Penguin penguin1 = new Penguin();
        Penguin penguin2 = new Penguin();

        System.out.println("====================");
        penguin1.walk();
        penguin1.swim();
        penguin2.slide();
        penguin2.eat();
        penguin1.sleep();
        penguin1.hunt();
        penguin2.protectEgg();
        penguin1.buildNest();
        penguin2.migrate();
        penguin1.communicate();

        System.out.println("====================");

        Penguin.getSpecies();
        Penguin.getHabitat();
        Penguin.getHeight();
        Penguin.getWeight();
        Penguin.getLifeSpan();
    }
}