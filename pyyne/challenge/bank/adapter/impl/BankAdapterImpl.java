package com.pyyne.challenge.bank.adapter.impl;

import com.bank1.integration.Bank1AccountSource;
import com.bank1.integration.Bank1Transaction;
import com.bank2.integration.Bank2AccountSource;
import com.bank2.integration.Bank2AccountTransaction;
import com.pyyne.challenge.bank.adapter.BankAdapter;
import com.pyyne.challenge.bank.model.BalanceBank;
import com.pyyne.challenge.bank.model.TransactionBank;
import com.pyyne.challenge.bank.utils.PrintUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAdapterImpl implements BankAdapter {

    private final Bank1AccountSource bank1Source = new Bank1AccountSource();
    private final Bank2AccountSource bank2Source = new Bank2AccountSource();

    @Override
    public List<BalanceBank> printBalances(long accountId) {
        List<BalanceBank> balanceBanks = new ArrayList<>();

        BalanceBank balanceBank1 = getBank1Balance(accountId);
        BalanceBank balanceBank2 = getBank2Balance(accountId);

        balanceBanks.add(balanceBank1);
        balanceBanks.add(balanceBank2);
        return balanceBanks;
    }

    @Override
    public List<TransactionBank> printTransactions(long accountId, Date fromDate, Date toDate)  {
        List<TransactionBank> transactionBanks = new ArrayList<>();

        List<Bank1Transaction> transactionsBank1 = bank1Source.getTransactions(accountId, fromDate, toDate);
        List<Bank2AccountTransaction> transactionsBank2 = bank2Source.getTransactions(accountId, fromDate, toDate);

        transactionsBank1.forEach(t -> transactionBanks.add(getBankTransaction(t)));
        transactionsBank2.forEach(t -> transactionBanks.add(getBankTransaction(t)));
        return transactionBanks;
    }

    private BalanceBank getBank1Balance(long accountId) {
        Double account = bank1Source.getAccountBalance(accountId);
        String currency = bank1Source.getAccountCurrency(accountId);
        return PrintUtil.printBalance(new BalanceBank(account, currency));
    }

    private BalanceBank getBank2Balance(long accountId) {
        return PrintUtil.printBalance(new BalanceBank(bank2Source.getBalance(accountId)));
    }

    private TransactionBank getBankTransaction(Bank1Transaction transaction) {
        return PrintUtil.printTransaction(TransactionBank.getBank(transaction));
    }

    private TransactionBank getBankTransaction(Bank2AccountTransaction transaction) {
        return PrintUtil.printTransaction(TransactionBank.getBank(transaction));
    }

}
