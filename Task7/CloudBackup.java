class CloudBackup{

    String backup;

    CloudBackup(String backup){
        this.backup=backup;
    }
	void getData(){
		System.out.println("Backup:"+this.backup);
	}
}