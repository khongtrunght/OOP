package com.b6;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> bankAccounts;

    public void addVipAccount(String name, String id){
        bankAccounts.add(new VipAccount(name, id));
    }

    public void addNormalAccount(String name, String id, float percent){
        bankAccounts.add(new NormalAccount(name, id, percent));
    }

    public void addAccount(Account acc){
        bankAccounts.add(acc);
    }

    public float getTotalMoney(){
        float total = 0;
        for (Account acc : bankAccounts){
            total += acc.getBalance();
        }
        return total;
    }

    public void printAllTransaction(){
        for (Account acc : bankAccounts){
            for (Transaction tran : acc.getTransactions()){
                System.out.println(tran);
            }
        }
    }





}
