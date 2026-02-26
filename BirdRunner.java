class BirdRunner{

    public static void main(String[] args){

        String[] birds = {"Peacock","Parrot","Crow","Sparrow","Pigeon","Flamingo","Swan","Eagle","Myna","Koel","Indian peafowl","Bulbul",
                           "Robin","Owl","Dove","Indian Roller","Black kite","Baya Weaver","Bee eater","Indian Robbin","sunbird"};

        for(int index = 0; index < birds.length; index++){
			
			System.out.println(birds[index]);

            String color = Bird.getColorByName(birds[index]);
            int life = Bird.getLifeSpan(birds[index]);

            
            System.out.println("Color: " + color);
            System.out.println("Life Span: " + life + " years");
            System.out.println("-----------------------------------");
        }
    }
}
