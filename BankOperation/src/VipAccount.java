public class VipAccount extends BankAccount implements IReceiveInterest{
    private static double MONTHLY_FEE = 50000d;
    private static double MINIMUM_AMOUNT = 500000d;
    private double interest_rate = 0.02d;

    public VipAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
        if (balance < MINIMUM_AMOUNT){
            throw new IllegalArgumentException("balance must be > " + MINIMUM_AMOUNT);
        }
    }

    @Override
    public void withdraw(double value) {
        printInfo();
        if (balance - value  < MINIMUM_AMOUNT){
            throw new IllegalArgumentException("Not have enough balance");
        }
        else {
            balance -= value;
            System.out.println("Withdraw " + value + " sucssessfully\nNew balance: " + balance);
        }
    }

    @Override
    public void monthlyFee() {
        balance -= MONTHLY_FEE;
    }

    @Override
    public double calculateInterest() {
        return balance * interest_rate;
    }

    @Override
    public void applyInterest() {
        double interest = calculateInterest();
        System.out.printf("Interest amount %.2f added to balance \n", interest);
        deposit(interest);
    }
}
