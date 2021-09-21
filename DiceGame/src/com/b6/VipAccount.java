package com.b6;

public class VipAccount extends Account implements Transferable {
    private static int MAX_RENT = 1000000000;
    private static int MAX_WIDRAW = 50000000;
    public VipAccount(String name, String id){
        super(name, id);
    }
    @Override
    public void debit(float amount) {
        assert amount < Math.min(MAX_WIDRAW, super.getBalance() + MAX_RENT);
        super.decrease(amount);
    }

    @Override
    public void transferMoney(Account targetAccount, float amount) {
        assert  getBalance() - amount > 0;
        targetAccount.increase(amount);
        this.decrease((float) (amount));
        this.transactions.add(new Transaction(this, targetAccount, amount));
    }
}
