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

		System.out.println("File Details");
		System.out.println("Name:"+this.name);
		System.out.println("Size:"+this.size);
		System.out.println("Pages:"+this.pages);
		System.out.println("Readable:"+this.readable);
		System.out.println("Writable:"+this.writable);
		System.out.println("Type:"+this.fileType);
		System.out.println("Owner:"+this.fileOwner);
		System.out.println("Location:"+this.fileLocation);
		System.out.println("Permission:"+this.filePermission);
		System.out.println("Format:"+this.fileFormat);
	}
}