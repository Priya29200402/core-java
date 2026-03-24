class ClothStore{
	Cloth[] cloths;
	int currentIndex;
	
	ClothStore(Cloth[] cloths){
		this.cloths=cloths;
	}
	
	void save(Cloth cloth){
		if(this.cloths != null && cloth != null){
            System.out.println("Checking to store Cloth Info");

            if(this.currentIndex < this.cloths.length){
               
                this.cloths[this.currentIndex] = cloth;
                this.currentIndex++;
            }else{
                System.out.println("Array is full, cannot store more cloth Info");
            }
        }else {
            System.out.println("cloth array is null");
        }
	}
}