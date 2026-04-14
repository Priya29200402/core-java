class Character{
	String character;
	int age;
	
	Character(String character,int age){
		this.character=character;
		this.age=age;
	}
	void getInfo(){
		System.out.println("Joker Character:"+this.character);
		System.out.println("Joker age:"+this.age);
	}
}