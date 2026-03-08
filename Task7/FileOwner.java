class FileOwner{

    String owner;

    FileOwner(String owner){
        this.owner = owner;
    }
	void getInfo(){
		System.out.println("File Owner: " + this.owner);
	}
}