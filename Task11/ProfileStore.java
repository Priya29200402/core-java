class ProfileStore{
	Profile[] profiles;
	int currentIndex;
	
	ProfileStore(Profile[] profiles){
		this.profiles=profiles;
	}
	void save(Profile profile){
		if(this.profiles != null && profile != null){
            System.out.println("Checking to store Profile Info");

            if(this.currentIndex < this.profiles.length){
               
                this.profiles[this.currentIndex] = profile;
                this.currentIndex++;
            }else{
                System.out.println("Array is full, cannot store more profiles Info");
            }
        }else {
            System.out.println("profile array is null");
        }
	}
}