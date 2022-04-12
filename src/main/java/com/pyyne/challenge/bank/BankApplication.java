package com.pyyne.challenge.bank;

import com.pyyne.challenge.bank.controller.BankController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

	//public static void main(String[] args) {
		//SpringApplication.run(BankApplication.class, args);
	//}

	public static void main(String[] args) {
		BankController.printBalances();
		BankController.printTransactions();
	}
}
