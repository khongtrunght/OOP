public class SavingAccount extends BankAccount implements IReceiveInterest{
    private static double MINIMUM_AMOUNT = 100d;
    private static double WITHDRAW_FEE = 20000d;
    private static double MONTHLY_FEE = 10000d;
    private static double PERCENT_FEE_RATIO = 0.05d;
    private static double interest_rate = 0.06d;

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
        if (balance < MINIMUM_AMOUNT){
            throw new IllegalArgumentException("Balance must be > " + MINIMUM_AMOUNT);
        }
    }

    @Override
    public void withdraw(double value) {
        printInfo();
        if (balance - value - getChargeFee(value) < MINIMUM_AMOUNT){
            throw new IllegalArgumentException("Not have enough balance");
        }
        else {
            balance -= value;
            chargeFee(value);
            System.out.println("Withdraw " + value + " sucssessfully with fee " + getChargeFee(value) + "\nNew balance: " + balance);
        }
    }

    @Override
    public void monthlyFee() {
        balance -= MONTHLY_FEE;
        System.out.println("Charge monthly fee : " + MONTHLY_FEE);
    }

    private void chargeFee(double value){
        balance -= Math.max(WITHDRAW_FEE, getChargeFee(value) );
    }

    private double getChargeFee(double value){
        return PERCENT_FEE_RATIO / 100 * value;
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

    public static void setInterestRate(double rate){
        interest_rate = rate;
    }

    public static double getInterestRate(){
        return interest_rate;
    }
}
