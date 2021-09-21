public abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void withdraw(double value);

    /**
     * Function to deposit funds into BankAccount as long as the value parameters
     * is > 0
     *
     * if value <= 0 throw Illegal Error
     * @param value value to be deposit
     */
    public void deposit(double value){
        if (value > 0){
            balance += value;
        }
        else {
            throw new IllegalArgumentException("Value must be > 0");
        }
    }

    /**
     * Charge fee for each type of Account
     */
    public abstract void monthlyFee();

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                '}';
    }

    public void printInfo(){
        System.out.println();
        System.out.println(toString());
    }
}
