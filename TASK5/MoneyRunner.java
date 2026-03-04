class MoneyRunner{
    public static void main(String[] args){

        Money money1 = new Money();
        Money money2 = new Money();

        System.out.println("====================");
        money1.deposit();
        money1.withdraw();
        money2.transfer();
        money2.checkBalance();
        money1.invest();
        money1.save();
        money2.spend();
        money1.earn();
        money2.exchange();
        money1.calculateInterest();

        System.out.println("====================");

        Money.getCurrencyType();
        Money.getCountry();
        Money.getSymbol();
        Money.getBankInfo();
        Money.getExchangeRate();
    }
}