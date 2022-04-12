package com.pyyne.challenge.bank.test.adpter;

import com.pyyne.challenge.bank.adapter.BankAdapter;
import com.pyyne.challenge.bank.adapter.impl.BankAdapterImpl;
import com.pyyne.challenge.bank.model.BalanceBank;
import com.pyyne.challenge.bank.model.TransactionBank;
import com.pyyne.challenge.bank.utils.Transactions;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAdapterTest {

    private final BankAdapter bankAdapter = new BankAdapterImpl();

    private static final int ACCOUNT_ID = 1;

    @Test
    void printBank1BalanceTest() {
        BalanceBank balance = new BalanceBank(215.5d, "USD");
        List<BalanceBank> response = bankAdapter.printBalances(ACCOUNT_ID);
        assertEquals(balance.getBalance(), response.get(0).getBalance());
        assertEquals(balance.getCurrency(), response.get(0).getCurrency());
    }

    @Test
    void printBank1PrintTransactionsTest() {
        Transactions credit = Transactions.DEBIT;
        TransactionBank transactionBank = new TransactionBank(25.5d, credit, "Debit card purchase");

        List<TransactionBank> response = bankAdapter.printTransactions(ACCOUNT_ID, new Date(), new Date());
        assertEquals(transactionBank.getAmount(), response.get(1).getAmount());
        assertEquals(transactionBank.getType(), response.get(1).getType());
        assertEquals(transactionBank.getText(), response.get(1).getText());
    }

    @Test
    void printBank2BalanceTest() {
        BalanceBank balance = new BalanceBank(512.5d, "USD");
        List<BalanceBank> response = bankAdapter.printBalances(ACCOUNT_ID);
        assertEquals(balance.getBalance(), response.get(1).getBalance());
        assertEquals(balance.getCurrency(), response.get(1).getCurrency());
    }

    @Test
    void printBank2PrintTransactionsTest() {
        Transactions credit = Transactions.DEBIT;
        TransactionBank transactionBank = new TransactionBank(125d, credit, "Amazon.com");

        List<TransactionBank> response = bankAdapter.printTransactions(ACCOUNT_ID, new Date(), new Date());
        assertEquals(transactionBank.getAmount(), response.get(3).getAmount());
        assertEquals(transactionBank.getType(), response.get(3).getType());
        assertEquals(transactionBank.getText(), response.get(3).getText());
    }

}