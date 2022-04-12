package com.pyyne.challenge.bank.adapter;

import com.pyyne.challenge.bank.model.BalanceBank;
import com.pyyne.challenge.bank.model.TransactionBank;

import java.util.Date;
import java.util.List;

public interface BankAdapter {

    List<BalanceBank> printBalances(long accountId);

    List<TransactionBank> printTransactions(long accountId, Date fromDate, Date toDate);

}
