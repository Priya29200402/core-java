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
        
		if(this.provider!=null){
			this.provider.getData();
		}
		else{
			System.out.println("Provider is null");	
		}
		if(this.region!=null){
			this.region.getData();
		}
		else{
			System.out.println("region is null");	
		}
		if(this.type!=null){
			this.type.getData();
		}
		else{
			System.out.println("Type is null");	
		}
		if(this.plan!=null){
			this.plan.getData();
		}
		else{
			System.out.println("plan is null");	
		}
		if(this.backup!=null){
			this.backup.getData();
		}
		else{
			System.out.println("backup is null");	
		}
    }
}