class Fort{
	String name;
	KingName king;
	Height height;
	
	Fort(String name, KingName king, Height height){
		this.name=name;
		this.king=king;
		this.height=height;
	}
	void printInfo(){
		System.out.println("Fort Name:"+this.name);
		System.out.println("King Name:"+king);
		
		if(this.height!=null){
			this.height.getHeight();
		}
		else{
			System.out.println("height cannot be null");
		}
	}
}