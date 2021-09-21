package com.b6;

public class Transaction {
    Account target;
    Account begin;
    float amount;

    public Transaction(Account begin, Account target, float amount){
        this.amount = amount;
        this.target = target;
        this.begin = begin;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "target=" + target +
                ", begin=" + begin +
                ", amount=" + amount +
                '}';
    }
}
