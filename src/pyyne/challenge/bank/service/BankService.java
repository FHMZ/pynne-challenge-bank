package com.pyyne.challenge.bank.service;

import com.pyyne.challenge.bank.adapter.BankAdapter;
import com.pyyne.challenge.bank.adapter.impl.BankAdapterImpl;

import java.util.Date;

public class BankService {

    private final BankAdapter adapter = new BankAdapterImpl();

    public void printBalances(long accountId) {
        adapter.printBalances(accountId);
    }

    public void printTransactions(long accountId, Date fromDate, Date toDate) {
        adapter.printTransactions(accountId, fromDate, toDate);
    }

}
