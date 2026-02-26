class Bird{
	
	static String  getColorByName(String name){
		
<<<<<<< HEAD
	
=======
		System.out.println("Name of the bird:"+name);
>>>>>>> 37474d0c8ca517504a73abfef11efce69956d03d
		
		if(name==null){
			
			System.out.println("Name cannot be null");
			return null;
		}
		
		if (name=="Peacock"){
			
			return "Blue and Green";
		}                                                               
		
		if (name=="Parrot"){
			
			return "Green";
		}
		
		if(name=="Crow"){
			
			return "Black";
			
		}
		
		if(name=="Sparrow"){
			
			return "Brown";
		}
		
		if(name=="Pigeon"){
			
			return "Grey";
		}
		if(name=="Flamingo"){
			
			return "Pink";
		}
		
		if(name=="Swan"){
			
			return "White";
		}
		if(name=="Eagle"){
			
			return "Dark Brown";
		}
		
		if(name=="Myna"){
			return "Brown";
		}
		
		if(name=="Koel"){
			
			return"Black";
			
		}
		
		if(name=="Indian peafowl"){
			
			return"Bright Blue";
		}
		
		if(name=="Bulbul"){
			return "Brown";
			
		}
		if(name=="Robin"){
			
			return"Black and White";
		}
		if(name=="Owl"){
			return "Golden brown";
		}
		
		if(name=="Dove"){
<<<<<<< HEAD
			return"Black and white";
=======
			return"Black and white"
>>>>>>> 37474d0c8ca517504a73abfef11efce69956d03d
		}
		
		if(name=="Indian Roller"){
			return "Bright blue";
		}
		
		if(name=="Black kite"){
			
			return "Dark brown";
		}
		
		if(name=="Baya Weaver"){
<<<<<<< HEAD
			return "Yellow";
=======
			return "Yellow"
>>>>>>> 37474d0c8ca517504a73abfef11efce69956d03d
		}
		
		if(name=="Bee eater"){
			return "Bright Green";
		}
		
		if(name=="Indian Robbin"){
			return "Dark brown";
		}
		if(name=="sunbird"){
			return "Purple";
		}
		
		System.out.println("Name is not matching with Database");
		return null;
	}
<<<<<<< HEAD
	
	
	static int getLifeSpan(String name){
        
        System.out.println("Name of the bird:"+name);
        
        if(name==null){
            System.out.println("Name cannot be null");
            return 0;
        }
        
        if(name=="Peacock"){
            return 20;
        }

        if(name=="Parrot"){
            return 50;
        }

        if(name=="Crow"){
            return 15;
        }

        if(name=="Sparrow"){
            return 5;
        }

        if(name=="Pigeon"){
            return 8;
        }

        if(name=="Flamingo"){
            return 30;
        }

        if(name=="Swan"){
            return 25;
        }

        if(name=="Eagle"){
            return 28;
        }

        if(name=="Myna"){
            return 12;
        }

        if(name=="Koel"){
            return 10;
        }

        if(name=="Indian peafowl"){
            return 20;
        }

        if(name=="Bulbul"){
            return 11;
        }

        if(name=="Robin"){
            return 13;
        }

        if(name=="Owl"){
            return 14;
        }

        if(name=="Dove"){
            return 12;
        }

        if(name=="Indian Roller"){
            return 15;
        }

        if(name=="Black kite"){
            return 18;
        }

        if(name=="Baya Weaver"){
            return 7;
        }

        if(name=="Bee eater"){
            return 6;
        }

        if(name=="Indian Robbin"){
            return 10;
        }

        if(name=="sunbird"){
            return 8;
        }
        
        System.out.println("Name is not matching with Database");
        return 0;
    }

=======
>>>>>>> 37474d0c8ca517504a73abfef11efce69956d03d
}