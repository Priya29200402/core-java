class TowerType{

	String towerName;
	int towerHeight;

	TowerType(String towerName,int towerHeight){
		this.towerName=towerName;
		this.towerHeight=towerHeight;
	}

	void getInfo(){
		System.out.println("Tower Name: "+this.towerName);
		System.out.println("Tower Height: "+this.towerHeight);
	}
}