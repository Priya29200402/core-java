class CarrotHalwaBrand{

	String halwaBrand;
	int halwaPrice;

	CarrotHalwaBrand(String halwaBrand,int halwaPrice){
		this.halwaBrand=halwaBrand;
		this.halwaPrice=halwaPrice;
	}

	void getInfo(){
		System.out.println("Carrot Halwa Brand: "+this.halwaBrand);
		System.out.println("Carrot Halwa Price: "+this.halwaPrice);
	}
}