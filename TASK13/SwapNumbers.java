class SwapNumbers{
    public static void main(String[] args){
        int number1=5;
        int number2=10;
        int temp;
		System.out.println("Before swapping Two numbers");
		System.out.println("Number 1:"+number1);
		System.out.println("Number 2:"+number2);

        temp=number1;
        number1=number2;
        number2=temp;

        System.out.println("After swapping Two numbers");
        System.out.println("Number1:" + number1);
        System.out.println("Number2:" + number2);
    }
}