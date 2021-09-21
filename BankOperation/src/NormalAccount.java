public class NormalAccount extends BankAccount{

    private static final double WITHDRAW_FEE = 3000d;
    private static final double MONTHLY_FEE = 10000d;
    private static double MINIMUM_AMOUNT = 100000d;
    public NormalAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
        if (balance < MINIMUM_AMOUNT){
            throw new IllegalArgumentException("balance must be > " + MINIMUM_AMOUNT);
        }
    }

    @Override
    public void withdraw(double value) {
        printInfo();
        if (balance - value - WITHDRAW_FEE < MINIMUM_AMOUNT){
            throw new IllegalArgumentException("Not have enough balance");
        }
        else {
            balance -= value;
            chargeFee(value);
            System.out.println("Withdraw " + value + " sucssessfully with fee " + WITHDRAW_FEE + "\nNew balance: " + balance);
        }
    }

    @Override
    public void monthlyFee() {
        balance -= MONTHLY_FEE;
        System.out.println("Charge monthly fee : " + MONTHLY_FEE);
    }

    private void chargeFee(double value){
        balance -= WITHDRAW_FEE;
    }


}
