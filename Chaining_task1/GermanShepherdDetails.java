class GermanShepherdDetails extends GermanShepherd{

    GermanShepherdDetails(String name, int age, String color){
        super(name,age,color);
    }

    GermanShepherdDetails(){
        super("Rocky",5,"Brown");
    }

    GermanShepherdDetails(String name){
        super(name,3,"Black");
    }
}