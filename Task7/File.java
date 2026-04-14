class File{

	String name;
	double size;
	int pages;
	boolean readable;
	boolean writable;

	FileType fileType;
	FileOwner fileOwner;
	FileLocation fileLocation;
	FilePermission filePermission;
	FileFormat fileFormat;

	File(String name,double size,int pages,boolean readable,boolean writable,
	     FileType fileType,FileOwner fileOwner,FileLocation fileLocation,
	     FilePermission filePermission,FileFormat fileFormat){

		this.name=name;
		this.size=size;
		this.pages=pages;
		this.readable=readable;
		this.writable=writable;
		this.fileType=fileType;
		this.fileOwner=fileOwner;
		this.fileLocation=fileLocation;
		this.filePermission=filePermission;
		this.fileFormat=fileFormat;
	}
		
	void getFileDetails(){

		System.out.println("File Details");
		System.out.println("Name:"+this.name);
		System.out.println("Size:"+this.size);
		System.out.println("Pages:"+this.pages);
		System.out.println("Readable:"+this.readable);
		System.out.println("Writable:"+this.writable);
		
		if(this.fileType!=null){
			this.fileType.getInfo();
		}
		else{
			System.out.println("File type is NUll");
		 }
		if(this.fileLocation!=null){
			this.fileLocation.getInfo();
		}
		else{
			System.out.println("File Location is Null");	
		}
		if(this.fileFormat!=null){
			this.fileFormat.getInfo();	
		}
		else{
			System.out.println("File Format is Null");
		}
		if(this.filePermission!=null){
			this.filePermission.getInfo();
		}
		else{
			System.out.println("File Permission is Null");
		}
		if(this.fileOwner!=null){
			this.fileOwner.getInfo();
		}
		else{
			System.out.println("File Owner is Null");	
		}
	}
	
}