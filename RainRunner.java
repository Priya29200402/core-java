class RainRunner{
    public static void main(String[] args){

        Rain rain1 = new Rain();
        System.out.println("Rain 1 ");
        System.out.println("Rain Type:"+rain1.type);
        System.out.println("Intensity:"+rain1.intensity);
        System.out.println("Season:"+rain1.season);
        System.out.println("Thunder is There:"+rain1.thunder);
        System.out.println("Location:"+rain1.location);
		System.out.println("==========================");

        Rain rain2 = new Rain("Heavy");
        System.out.println("Rain 2");
        System.out.println("Rain Type:"+rain2.type);
        System.out.println("Intensity:"+rain2.intensity);
        System.out.println("Season:"+rain2.season);
        System.out.println("Thunder is There:"+rain2.thunder);
        System.out.println("Location:"+rain2.location);
		System.out.println("==========================");

        Rain rain3 = new Rain("Light", 5.5);
        System.out.println("Rain 3");
        System.out.println("Rain Type:"+rain3.type);
        System.out.println("Intensity:"+rain3.intensity);
        System.out.println("Season:"+rain3.season);
        System.out.println("Thunder is There:"+rain3.thunder);
        System.out.println("Location:"+rain3.location);
		System.out.println("==========================");

        Rain rain4 = new Rain("Moderate", 10.0, "Monsoon");
        System.out.println("Rain 4");
       System.out.println("Rain Type:"+rain4.type);
        System.out.println("Intensity:"+rain4.intensity);
        System.out.println("Season:"+rain4.season);
        System.out.println("Thunder is There:"+rain4.thunder);
        System.out.println("Location:"+rain4.location);
		System.out.println("==========================");

        Rain rain5 = new Rain("Storm", 20.0, "Winter", true);
        System.out.println(" Rain 5");
        System.out.println("Rain Type:"+rain5.type);
        System.out.println("Intensity:"+rain5.intensity);
        System.out.println("Season:"+rain5.season);
        System.out.println("Thunder is There:"+rain5.thunder);
        System.out.println("Location:"+rain5.location);
		System.out.println("==========================");
		
        Rain rain6 = new Rain("Drizzle", 2.5, "Summer", false, "Village");
        System.out.println(" Rain 6 ");
        System.out.println("Rain Type:"+rain6.type);
        System.out.println("Intensity:"+rain6.intensity);
        System.out.println("Season:"+rain6.season);
        System.out.println("Thunder is There:"+rain6.thunder);
        System.out.println("Location:"+rain6.location);
		System.out.println("==========================");
    }
}