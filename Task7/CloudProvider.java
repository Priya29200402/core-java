class CloudProvider{

    String provider;

    CloudProvider(String provider){
        this.provider=provider;
    }  
	void getData(){
	System.out.println("Provider:"+this.provider);
	}	
}