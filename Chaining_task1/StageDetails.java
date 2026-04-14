class StageDetails extends Stage{

    StageDetails(String name, int capacity, String location){
        super(name, capacity, location);
    }

    StageDetails(){
        super("MainStage",500,"Bangalore");
    }

    StageDetails(String name){
        super(name,300,"Mysore");
    }
}