package com.pyyne.challenge.bank.model;

import com.pyyne.challenge.bank.utils.Transactions;
import integration.bank1.Bank1Transaction;
import integration.bank2.Bank2AccountTransaction;

public class TransactionBank {

    private double amount;
    private Transactions type;
    private String text;

    public TransactionBank() {
    }

    public TransactionBank(double amount, Transactions type, String text) {
        this.amount = amount;
        this.type = type;
        this.text = text;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Transactions getType() {
        return type;
    }

    public void setType(Transactions type) {
        this.type = type;
    }

    public void setType(String type) {
        if (Transactions.DEBIT.getDescription().equals(type)) {
            setType(Transactions.DEBIT);
        } else {
            setType(Transactions.CREDIT);
        }
    }

    public void setType(int type) {
        if (Transactions.DEBIT.getType() == type) {
            setType(Transactions.DEBIT);
        } else {
            setType(Transactions.CREDIT);
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static TransactionBank getBank(Bank1Transaction bank1) {
        TransactionBank transactionBank = new TransactionBank();
        transactionBank.setAmount(bank1.getAmount());
        transactionBank.setType(bank1.getType());
        transactionBank.setText(bank1.getText());
        return transactionBank;
    }

    public static TransactionBank getBank(Bank2AccountTransaction bank2) {
        TransactionBank transactionBank = new TransactionBank();
        transactionBank.setAmount(bank2.getAmount());
        transactionBank.setType(bank2.getType().name());
        transactionBank.setText(bank2.getText());
        return transactionBank;
    }

}
