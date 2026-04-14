class Banner{

	String[] bannerMaterials;
	BannerType[] bannerTypes;

	Banner(String[] bannerMaterials,BannerType[] bannerTypes){
		this.bannerMaterials=bannerMaterials;
		this.bannerTypes=bannerTypes;
	}

	void printInfo(){

		System.out.println("\n====== Banner Details ======");

		if(this.bannerMaterials!=null){
			System.out.println("Materials length: "+this.bannerMaterials.length);
			for(String material:this.bannerMaterials){
				System.out.println("Banner Material: "+material);
			}
		}

		if(this.bannerTypes!=null){
			System.out.println("Types length: "+this.bannerTypes.length);
			for(BannerType type:this.bannerTypes){
				if(type!=null){
					type.getInfo();
				}
			}
		}
	}
}