class Spa{

    String name;
    int rooms;
    double price;
    boolean open;
    int staff;

    SpaOwner owner;
    SpaLocation location;
    SpaType type;
    SpaService service;
    SpaRating rating;

    Spa(String name,int rooms,double price,boolean open,int staff,
        SpaOwner owner,SpaLocation location,SpaType type,SpaService service,SpaRating rating){

        this.name=name;
        this.rooms=rooms;
        this.price=price;
        this.open=open;
        this.staff=staff;
        this.owner=owner;
        this.location=location;
        this.type=type;
        this.service=service;
        this.rating=rating;
    }

    void getSpaDetails(){

        System.out.println("Name:"+this.name);
        System.out.println("Rooms:"+this.rooms);
        System.out.println("Price:"+this.price);
        System.out.println("Open:"+this.open);
        System.out.println("Staff:"+this.staff);

       if(this.owner!=null){
		   
	    this.owner.getData();
	   }
	   else{
		   System.out.println("Owner name is null");
	   }
	   if(location!=null){
		   this.location.getData();
	   }
	   else{
		  System.out.println("Location is null"); 
	   }
	   if(this.type!=null){
		   this.type.getData();
	   }
	   else{
		   System.out.println("spa type is null");
	   }
	   if(this.service!=null){
		   this.service.getData();
	   }
	   else{
		   System.out.println("Spa service is null");
	   }
	   if(this.rating!=null){
		   this.rating.getData();
	   }
	   else{
		   System.out.println("Spa rating is null");
	   }
    }
}