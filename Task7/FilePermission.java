class FilePermission{

	String permission;

	FilePermission(String permission){
		this.permission=permission;
	}
	void getInfo(){
		System.out.println("File Permission:"+this.permission);
	}
}