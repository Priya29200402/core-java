class Farmer{
    String name;
    int age;
    String crop;
    double landSize;
    boolean hasTractor;
    String location;

    Farmer(String name, int age, String crop, double landSize, boolean hasTractor, String location){
        this.name = name;
        this.age = age;
        this.crop = crop;
        this.landSize = landSize;
        this.hasTractor = hasTractor;
        this.location = location;
    }

    void printInfo(){
        System.out.println("Farmer Details");
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Crop:"+this.crop);
        System.out.println("Land Size:"+this.landSize);
        System.out.println("Has Tractor:"+this.hasTractor);
        System.out.println("Location:"+this.location);
    }
}