class Cloud{

    String serviceName;
    int storageCapacity;
    double pricePerMonth;
    boolean secure;
    int users;
    CloudProvider provider;
    CloudRegion region;
    CloudType type;
    CloudPlan plan;
    CloudBackup backup;

    Cloud(String serviceName,int storageCapacity,double pricePerMonth,boolean secure,int users,
          CloudProvider provider,CloudRegion region,CloudType type,CloudPlan plan,CloudBackup backup){

        this.serviceName=serviceName;
        this.storageCapacity=storageCapacity;
        this.pricePerMonth=pricePerMonth;
        this.secure=secure;
        this.users=users;
        this.provider=provider;
        this.region=region;
        this.type=type;
        this.plan=plan;
        this.backup=backup;
    }

    void getCloudDetails(){

        System.out.println("Service Name: "+this.serviceName);
        System.out.println("Storage Capacity: "+this.storageCapacity+" GB");
        System.out.println("Price Per Month: "+this.pricePerMonth);
        System.out.println("Secure: "+this.secure);
        System.out.println("Users: "+this.users);
        System.out.println("Provider: "+this.provider);
        System.out.println("Region: "+this.region);
        System.out.println("Type: "+this.type);
        System.out.println("Plan: "+this.plan);
        System.out.println("Backup: "+this.backup);
    }
}