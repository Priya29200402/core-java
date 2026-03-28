class Gender{
	String[] genders;
	int currentIndex=0;
	
	Gender(String[] genders){
		this.genders=genders;
	}
	
	void save(String gender){
		System.out.println("Executing save in Genders");
		System.out.println("Gender:"+gender);
		
		if(this.genders != null && gender != null){
			System.out.println("Genders adn gender are not null we can store");
			int currentSize=this.genders.length -1;
			
			if(currentIndex <= currentSize){
				this.genders[currentIndex]=gender;
				currentIndex++;
			}else{
				System.out.println("Array is full we cannot store more...");
			}
		}else{
			System.out.println("Genders and gender are NUll");
		}
	}

	void printInfo(){
		System.out.println("Printing all the Genders");
		if(this.genders != null){
			for(int i=0;i<=this.genders.length-1;i++){
				System.out.println("Gender:"+genders[i]);
			}
		}else{
			System.out.println("The array is null...");
		}
	}

	void sortAscending(){
		System.out.println("Sorting in Ascending Order ");
		if(this.genders != null){
			for(int i=0;i<=this.genders.length-1;i++){
				for(int j=i+1;j<=this.genders.length-1;j++){
					if(this.genders[i]!= null && this.genders[j]!= null){
						if(this.genders[i].compareToIgnoreCase(this.genders[j])>0){
							String temp=this.genders[i];
							this.genders[i]=this.genders[j];
							this.genders[j]=temp;
						}
					}
				}
			}
		}else{
			System.out.println("Array is null we cannot sort...");
		}
	}

	void sortDescending(){
		System.out.println("Sorting in Descending order");
		if(this.genders != null){
			for(int i=0;i<=this.genders.length-1;i++){
				for(int j=i+1;j<=this.genders.length-1;j++){
					if(this.genders[i]!= null && this.genders[j]!= null){
						if(this.genders[i].compareToIgnoreCase(this.genders[j])<0){
							String temp=this.genders[i];
							this.genders[i]=this.genders[j];
							this.genders[j]=temp;
						}
					}
				}
			}
		}else{
			System.out.println("Array is null we cannot sort...");
		}
	}
	
}