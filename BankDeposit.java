class BankDeposit {
    public static void main(String[] args) {

        int balance = 1000;
        int count = 1;

        while(count <= 5) {
            balance += 500;   // deposit 500
            System.out.println("Deposit " + count + " Balance: " + balance);
            count++;
        }
    }
}
