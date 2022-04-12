package com.pyyne.challenge.bank.controller;

import com.pyyne.challenge.bank.service.BankService;

import java.util.Date;

/**
 * Controller that pulls information form multiple bank integrations and prints them to the console.
 *
 * Created by Par Renyard on 5/12/21.
 */
public class BankController {

    private static final BankService service = new BankService();

    public static void printBalances() {
        System.out.println("===== STARTING BALANCES =====");
        service.printBalances(1);
        System.out.println("===== ENDING BALANCES ===== \n");
    }

    public static void printTransactions() {
        System.out.println("===== STARTING TRANSACTIONS ===== ");
        service.printTransactions(1, new Date(), new Date());
        System.out.println("===== ENDING TRANSACTIONS ===== \n");
    }

}
