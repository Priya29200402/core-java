class ATM {
    public static void main(String[] args) {
        double balance = 5000;
        double withdrawAmount = 6000;

        if(withdrawAmount <= balance) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}