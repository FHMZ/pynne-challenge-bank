package com.pyyne.challenge.bank.model;

import com.bank2.integration.Bank2AccountBalance;

public class BalanceBank {

    private double balance;
    private String currency;

    public BalanceBank(Bank2AccountBalance bank2) {
        this.balance = bank2.getBalance();
        this.currency = bank2.getCurrency();
    }

    public BalanceBank(double balance, String currency) {
        this.balance = balance;
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

}
