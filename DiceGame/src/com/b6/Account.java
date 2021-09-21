package com.b6;

import java.util.ArrayList;

public abstract class Account {
    private String name;
    private String id;
    protected ArrayList<Transaction> transactions;
    private float balance;

    public Account(String name, String id){
        this.name = name;
        this.id = id;
        this.balance = 0;
        transactions = new ArrayList<>();
    }

    public void credit(float amount){
        this.balance += amount;
    }

    public abstract void debit(float amount);

    public float getBalance() {
        return balance;
    }

    protected void decrease(float amount){
        balance -= amount;
    }

    protected void increase(float amount) {
        balance += amount;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
