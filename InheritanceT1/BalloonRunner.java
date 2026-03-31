class BalloonRunner{
    public static void main(String[] args){

        AirBalloon airBalloon1=new AirBalloon();
        airBalloon1.color="Red"; 
		System.out.println("Color:"+airBalloon1.color);
		airBalloon1.price=100; 
		System.out.println("price:"+airBalloon1.price);
		airBalloon1.flying=true;
		System.out.println("flying:"+airBalloon1.flying);
		
        airBalloon1.type="HotAir";
        System.out.println("Type:"+airBalloon1.type);		
		airBalloon1.gas="Helium"; 
		System.out.println("gas:"+airBalloon1.gas);
		airBalloon1.capacity=5;
		System.out.println("capacity:"+airBalloon1.capacity);
		airBalloon1.company="Sky"; 
		System.out.println("company:"+airBalloon1.company);
		airBalloon1.size="Large";
		System.out.println("size:"+airBalloon1.size);
		
		System.out.println("----Methods----");
        airBalloon1.inflate(); 
		airBalloon1.releaseAir(); 
		airBalloon1.displayDetails();

        AirBalloon airBalloon2=new AirBalloon();
        airBalloon2.color="Blue"; 
	    System.out.println("color:"+airBalloon2.color);
		airBalloon2.price=120;
		System.out.println("price:"+airBalloon2.price);
		airBalloon2.flying=false;
		System.out.println("flying:"+airBalloon2.flying);
        airBalloon2.type="Normal";
		System.out.println("type:"+airBalloon2.type);
		airBalloon2.gas="Air"; 
		System.out.println("gas:"+airBalloon2.gas);
		airBalloon2.capacity=2; 
		System.out.println("capacity:"+airBalloon2.capacity);
		airBalloon2.company="Fly"; 
		System.out.println("company:"+airBalloon2.company);
		airBalloon2.size="Medium";
		System.out.println("size:"+airBalloon2.size);
		
		System.out.println("----Methods----");
        airBalloon2.inflate(); 
		airBalloon2.releaseAir(); 
		airBalloon2.displayDetails();

        Balloon balloon1=new AirBalloon();
        balloon1.color="Green"; 
		System.out.println("Color:"+balloon1.color);
		
		balloon1.price=80; 
		System.out.println("price:"+balloon1.price);
		
		balloon1.flying=true;
		System.out.println("flying:"+balloon1.flying);
		
		System.out.println("----Methods----");
        balloon1.inflate(); 
		balloon1.releaseAir();

        Balloon balloon2=new AirBalloon();
        balloon2.color="Yellow";
		System.out.println("color:"+balloon2.color);
		balloon2.price=90;
		System.out.println("price:"+balloon2.price);
		balloon2.flying=false;
		System.out.println("flying:"+balloon2.flying);
		
		System.out.println("----Methods----");
        balloon2.inflate();
		balloon2.releaseAir();

        Balloon balloon3=new Balloon();
        balloon3.color="Pink"; 
		System.out.println("color:"+balloon3.color);
		balloon3.price=70; 
		System.out.println("price:"+balloon3.price);
		balloon3.flying=true;
		System.out.println("flying:"+balloon3.flying);
		
		System.out.println("----Methods----");
        balloon3.inflate();
		balloon3.releaseAir();

        Balloon balloon4=new Balloon();
        balloon4.color="White";
		System.out.println("color:"+balloon4.color);
		balloon4.price=60; 
		System.out.println("price:"+balloon4.price);
		balloon4.flying=false;
		System.out.println("flying:"+balloon4.flying);
		
		System.out.println("----Methods----");
        balloon4.inflate(); 
		balloon4.releaseAir();
    }
}