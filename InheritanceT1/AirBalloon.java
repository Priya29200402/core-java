class AirBalloon extends Balloon{
    String type;
    String gas;
    int capacity;
    String company;
    String size;

    AirBalloon(){
        super();
        System.out.println("Creating AirBalloon constructor...");
    }

    void displayDetails(){
        System.out.println("Executing displayDetails in AirBalloon...");
    }
}