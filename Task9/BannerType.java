class BannerType{

	String bannerName;
	int bannerCost;

	BannerType(String bannerName,int bannerCost){
		this.bannerName=bannerName;
		this.bannerCost=bannerCost;
	}

	void getInfo(){
		System.out.println("Banner Type: "+this.bannerName);
		System.out.println("Banner Cost: "+this.bannerCost);
	}
}