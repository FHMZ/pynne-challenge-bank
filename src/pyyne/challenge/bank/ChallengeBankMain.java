package com.pyyne.challenge.bank;

import com.pyyne.challenge.bank.controller.BankController;

public class ChallengeBankMain {

    public static void main(String[] args) {
        BankController.printBalances();
        BankController.printTransactions();
    }

}
