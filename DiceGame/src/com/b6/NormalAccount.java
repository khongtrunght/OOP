package com.b6;

import java.util.ArrayList;

public class NormalAccount extends Account implements  Transferable{
    private float percent;

    public void getInterest(int numMonths){}

    public NormalAccount(String name, String id, float percent){
        super(name, id);
        this.percent = percent;

    }

    @Override
    public void transferMoney(Account targetAccount, float amount) {
        assert  getBalance() - amount > 0;
        targetAccount.increase(amount);
        this.decrease((float) (amount * 1.05));

    }

    @Override
    public void debit(float amount) {
        assert amount < Math.min(super.getBalance(), 10000000);
        super.decrease(amount);
    }


}
