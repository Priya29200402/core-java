class DropletRunner{
    public static void main(String[] args){

        Droplet droplet1 = new Droplet();
		System.out.println(" Droplet 1");
		System.out.println("Color:"+droplet1.color);
		System.out.println("Size:"+droplet1.size);
		System.out.println("Shape:"+droplet1.shape);
		System.out.println("Pure:"+droplet1.pure);
		System.out.println("Source:"+droplet1.source);
		System.out.println("==========================");
       
	    Droplet droplet2 = new Droplet("Blue");
		System.out.println("Droplet 2");
		System.out.println("Color:"+droplet2.color);
		System.out.println("Size:"+droplet2.size);
		System.out.println("Shape:"+droplet2.shape);
		System.out.println("Pure:"+droplet2.pure);
		System.out.println("Source:"+droplet2.source);
		System.out.println("==========================");
		
        Droplet droplet3 = new Droplet("Red", 1.2);
		System.out.println("Droplet 3");
		System.out.println("Color:"+droplet3.color);
		System.out.println("Size:"+droplet3.size);
		System.out.println("Shape:"+droplet3.shape);
		System.out.println("Pure:"+droplet3.pure);
		System.out.println("Source:"+droplet3.source);
		System.out.println("==========================");
	
        Droplet droplet4 = new Droplet("Green", 1.5, "Oval");
		System.out.println("Droplet 4");
		System.out.println("Color:"+droplet4.color);
		System.out.println("Size:"+droplet4.size);
		System.out.println("Shape:"+droplet4.shape);
		System.out.println("Pure:"+droplet4.pure);
		System.out.println("Source:"+droplet4.source);
		System.out.println("==========================");
		
        Droplet droplet5 = new Droplet("Yellow", 2.0, "Round", false);
		System.out.println("Droplet 5");
		System.out.println("Color:"+droplet5.color);
		System.out.println("Size:"+droplet5.size);
		System.out.println("Shape:"+droplet5.shape);
		System.out.println("Pure:"+droplet5.pure);
		System.out.println("Source:"+droplet5.source);
		System.out.println("==========================");
		
        Droplet droplet6 = new Droplet("White", 2.5, "Square", true, "River");
		System.out.println("Droplet 6");
		System.out.println("Color:"+droplet6.color);
		System.out.println("Size:"+droplet6.size);
		System.out.println("Shape:"+droplet6.shape);
		System.out.println("Pure:"+droplet6.pure);
		System.out.println("Source:"+droplet6.source);
		System.out.println("==========================");
      
    }
}