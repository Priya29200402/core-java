class Joker{
	int[] evolutions;
	Character[] characters;
	
	Joker(int[] evolutions, Character[] characters){
		this.evolutions=evolutions;
		this.characters=characters;
	}
	void printInfo(){
		System.out.println("\n=======Joker Details=======");
		if(this.evolutions!=null){
			System.out.println("evolutions length:"+this.evolutions.length);
			for(int evolution:this.evolutions){
				System.out.println("Evolution of Character:"+evolution);
			}
		}
		if(this.characters!=null){
			System.out.println("Character length:"+this.characters.length);
			for(Character character:this.characters){
				character.getInfo();
			}
		}
	}
}