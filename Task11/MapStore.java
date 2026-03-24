class MapStore{
	Map[] maps;
	int currentIndex;
	
	MapStore(Map[] maps){
		this.maps=maps;
	}
	void save(Map map){
		 if (this.maps != null && map != null){
            System.out.println("Checking to store Map Info");

            if (this.currentIndex < this.maps.length){
               
                this.maps[this.currentIndex] = map;
                this.currentIndex++;
            } else{
                System.out.println("Array is full, cannot store more MapInfo");
            }
        } else {
            System.out.println("Map array is null");
        }
    }
}
