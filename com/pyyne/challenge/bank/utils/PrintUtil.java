package com.pyyne.challenge.bank.utils;

import com.pyyne.challenge.bank.model.BalanceBank;
import com.pyyne.challenge.bank.model.TransactionBank;

public class PrintUtil {

    private PrintUtil() {
    }

    public static BalanceBank printBalance(BalanceBank balance) {
        System.out.println("BALANCE: " + balance.getBalance());
        System.out.println("CURRENCY: " + balance.getCurrency());
        System.out.println("================");
        return balance;
    }

    public static TransactionBank printTransaction(TransactionBank bank) {
        System.out.println("AMOUNT: " + bank.getAmount());
        System.out.println("TYPE: " + bank.getType());
        System.out.println("TEXT: " + bank.getText());
        System.out.println("================");
        return bank;
    }

}
