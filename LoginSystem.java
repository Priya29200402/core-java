class LoginSystem{
    public static void main(String[] args){

        int attempts = 1;

        do {
            System.out.println("Enter Password (Attempt " + attempts + ")");
            attempts++;
        } while(attempts <= 3);
    }
}