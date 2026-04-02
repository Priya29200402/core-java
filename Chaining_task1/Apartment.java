class Apartment extends Building{

    Apartment(String name, int floors, String city){
        super(name,floors,city);
    }

    Apartment(){
        super("SkyTower",10,"Delhi");
    }

    Apartment(String name){
        super(name,5,"Pune");
    }
}