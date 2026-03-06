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

        System.out.println("Owner:"+this.owner);
        System.out.println("Location:"+this.location);
        System.out.println("Type:"+this.type);
        System.out.println("Service:"+this.service);
        System.out.println("Rating:"+this.rating);
    }
}