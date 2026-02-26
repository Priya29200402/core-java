class Fruits{
	
	public static void main(String[] args) {
        checkFruit((byte)2);
    }

    static void checkFruit(byte value){

        switch (value){
            case 1:
                System.out.println("Apple");
                break;
            case 2:
                System.out.println("Banana");
                break;
            case 3:
                System.out.println("Mango");
                break;
            case 4:
                System.out.println("Orange");
                break;
            case 5:
                System.out.println("Grapes");
                break;
            default:
                System.out.println("Invalid Choice");
				break;
        }
    }
}