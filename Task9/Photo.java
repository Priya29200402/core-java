class Photo{
	int copy;
	String size;
	
	Photo(int copy, String size){
		this.copy=copy;
		this.size=size;
	}
	void getInfo(){
		System.out.println("Photo Copy:"+this.copy);
		System.out.println("Photo size:"+this.size);
		
	}
}