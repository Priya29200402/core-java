class WaterfallRunner{
	
	public static void main (String [] args){
		
		System.out.println("WATER FALLS DETAILS");
		
		WaterFall.info("Jog Falls",253,"Karnataka",true);
		WaterFall.info("Gokak Falls",52,"Karnataka",true);
		WaterFall.info("Jhari Falls",70,"Karnataka",true);
		WaterFall.info("Kunchikal Falls",455,"Karnataka",true);
		WaterFall.info("Shivanasamudra Falls",98,"Karnataka",true);
		
		WaterFall.stateOwningInfo("Jog Falls","Karnataka","India",253,true);
		WaterFall.stateOwningInfo("Gokak Falls","Karnataka","India",52,true);
		WaterFall.stateOwningInfo("Jhari Falls","Karnataka","India",70,true);
		WaterFall.stateOwningInfo("Kunchikal Falls","Karnataka","India",455,true);
		WaterFall.stateOwningInfo("Shivanasamudra Falls","Karnataka","India",98,true);
		
		
	}
}