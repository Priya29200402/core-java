class ZooCreator{

    static void getZoo(){
        Zoo zoo = new Zoo();
        System.out.println("Zoo Name:" + zoo.name);
        System.out.println("=====================");
    }

    static void getZoo(String name){
        System.out.println("Creating Zoo with Name: " + name);
        Zoo zoo = new Zoo(name);
        System.out.println("Zoo Name: " + zoo.name);
        System.out.println("Number of Animals: " + zoo.numberOfAnimals);
        System.out.println("=====================");
    }

    static void getZoo(String name, int numberOfAnimals){
        System.out.println("Creating Zoo with name and animal count");
        Zoo zoo = new Zoo(name, numberOfAnimals);
        System.out.println("Zoo Name: " + zoo.name);
        System.out.println("Number of Animals: " + zoo.numberOfAnimals);
        System.out.println("=====================");
    }
}