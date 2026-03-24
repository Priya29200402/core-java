class CloudSoftware{
    String name;
    String provider;
    double price;
    int users;
    boolean isSubscription;
    String version;

    CloudSoftware(String name, String provider, double price, int users, boolean isSubscription, String version){
        this.name = name;
        this.provider = provider;
        this.price = price;
        this.users = users;
        this.isSubscription = isSubscription;
        this.version = version;
    }

    void printInfo(){
        System.out.println("Cloud Software Details");
        System.out.println("Name:"+this.name);
        System.out.println("Provider:"+this.provider);
        System.out.println("Price:"+this.price);
        System.out.println("Users:"+this.users);
        System.out.println("Subscription:"+this.isSubscription);
        System.out.println("Version:"+this.version);
    }
}