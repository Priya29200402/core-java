class Artist extends MusicInstrument{
	
	Artist(String name, double price, String artist){
		
		super(name,price,artist);
		
	}
	Artist(){
		super("Keyboard",30000.15,"ARJUN JANYA");
	}
	Artist(String name){
         super(name,45000.50,"SHIVA");
	}
}