class Zoo{
    String name;
    int numberOfAnimals;

    Zoo(){
        this.name =name;
        this.numberOfAnimals =numberOfAnimals;
        System.out.println("Creating Zoo without arguments");
    }

    Zoo(String name){
        this.name = name;
        System.out.println("Created Zoo with String constructor");
    }

    Zoo(String name, int numberOfAnimals){
        this.name = name;
        this.numberOfAnimals = numberOfAnimals;
        System.out.println("Created Zoo with String, int constructor");
    }
}