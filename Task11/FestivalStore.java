class FestivalStore{
	Festival[] festivals;
	int currentIndex;
	
	FestivalStore(Festival[] festivals){
		this.festivals=festivals;
		
	}
	void save(Festival festival){
		if (this.festivals != null && festival != null){
            System.out.println("Checking to store Festival Info");

            if (this.currentIndex < this.festivals.length){
               
                this.festivals[this.currentIndex] = festival;
                this.currentIndex++;
            } else{
                System.out.println("Array is full, cannot store more Festival Info");
            }
        } else {
            System.out.println("Festival array is null");
        }
	}
}