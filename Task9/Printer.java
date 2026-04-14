class Printer{
	String[] documents;
	Photo[] photo;
	
	Printer(String[] documents, Photo[] photo){
		this.documents=documents;
		this.photo=photo;
	}
	void printInfo(){
		System.out.println("\n=====Printer Details=======");
		
		if(this.documents!=null){
			System.out.println("length of documents:"+this.documents.length);
			for(String document : this.documents){
				System.out.println("Document name:"+document);
			}
		}
		if(this.photo!=null){
			System.out.println("lenght of photo:"+this.photo.length);
			for(Photo photo:this.photo){
				photo.getInfo();
			}
		}
	}
	
}