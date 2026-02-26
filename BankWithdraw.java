class BankWithdraw {
    public static void main(String[] args) {

        int balance = 5000;
        int count = 1;

        while(count <= 5) {
            balance -= 400;   
            System.out.println("Withdraw " + count + " Balance: " + balance);
            count++;
        }
    }
}
