class SnowRunner{
    public static void main(String[] args){

        Snow snow1 = new Snow();
        System.out.println("Snow 1");
        System.out.println("Color:"+snow1.color);
        System.out.println("Temperature:"+snow1.temperature);
        System.out.println("Type:"+snow1.type);
        System.out.println("Falling:"+snow1.falling);
        System.out.println("Location:"+snow1.location);
		System.out.println("===========================");

        Snow snow2 = new Snow("White");
        System.out.println("Snow 2 ");
        System.out.println("Color:"+snow2.color);
        System.out.println("Temperature:"+snow2.temperature);
        System.out.println("Type:"+snow2.type);
        System.out.println("Falling:"+snow2.falling);
        System.out.println("Location:"+snow2.location);
		System.out.println("===========================");
		
        Snow snow3 = new Snow("Light White", -5.0);
        System.out.println("Snow 3");
         System.out.println("Color:"+snow3.color);
        System.out.println("Temperature:"+snow3.temperature);
        System.out.println("Type:"+snow3.type);
        System.out.println("Falling:"+snow3.falling);
        System.out.println("Location:"+snow3.location);
		System.out.println("===========================");

        Snow snow4 = new Snow("Crystal White", -10.0, "Powder");
        System.out.println("Snow 4");
        System.out.println("Color:"+snow4.color);
        System.out.println("Temperature:"+snow4.temperature);
        System.out.println("Type:"+snow4.type);
        System.out.println("Falling:"+snow4.falling);
        System.out.println("Location:"+snow4.location);
		System.out.println("===========================");
		
        Snow snow5 = new Snow("Grey White", -2.0, "Wet", true);
        System.out.println(" Snow 5 ");
         System.out.println("Color:"+snow5.color);
        System.out.println("Temperature:"+snow5.temperature);
        System.out.println("Type:"+snow5.type);
        System.out.println("Falling:"+snow5.falling);
        System.out.println("Location:"+snow5.location);
		System.out.println("===========================");

        Snow snow6 = new Snow("Pure White", -15.0, "Fluffy", false, "Himalayas");
        System.out.println(" Snow 6 ");
        System.out.println("Color:"+snow6.color);
        System.out.println("Temperature:"+snow6.temperature);
        System.out.println("Type:"+snow6.type);
        System.out.println("Falling:"+snow6.falling);
        System.out.println("Location:"+snow6.location);
		System.out.println("===========================");
    }
}
}