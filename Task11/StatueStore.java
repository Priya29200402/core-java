class StatueStore{
	Statue[] statues;
	int currentIndex;
	
	StatueStore(Statue[] statues){
		this.statues=statues;
	}
	
	void save(Statue statue){
		if(this.statues != null && statue != null){
            System.out.println("Checking to store Statue Info");

            if(this.currentIndex < this.statues.length){
               
                this.statues[this.currentIndex] = statue;
                this.currentIndex++;
            }else{
                System.out.println("Array is full, cannot store more statue Info");
            }
        }else {
            System.out.println("statue array is null");
        }
	}
}