class Scanner{
	String[] types;
	ScannerName[] names;
	
	Scanner(String[] types,ScannerName[] names){
		this.types=types;
		this.names=names;
	}
	void printInfo(){
		System.out.println("\n=======Scanner Details=======");
		if(this.types!=null){
			System.out.println("Type length:"+this.types.length);
			for(String type:this.types){
				System.out.println("Scanner Type:"+type);
			}
		}
		if(this.names!=null){
			System.out.println("name length:"+this.names.length);
			for(ScannerName name:names){
				name.getInfo();
			}
		}
	}
}