class Tower{

	String[] towerLocations;
	TowerType[] towerTypes;

	Tower(String[] towerLocations,TowerType[] towerTypes){
		this.towerLocations=towerLocations;
		this.towerTypes=towerTypes;
	}

	void printInfo(){

		System.out.println("\n====== Tower Details ======");

		if(this.towerLocations!=null){
			System.out.println("Locations length: "+this.towerLocations.length);
			for(String location:this.towerLocations){
				System.out.println("Tower Location: "+location);
			}
		}

		if(this.towerTypes!=null){
			System.out.println("Types length: "+this.towerTypes.length);
			for(TowerType type:this.towerTypes){
				if(type!=null){
					type.getInfo();
				}
			}
		}
	}
}