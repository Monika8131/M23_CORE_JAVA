package com.cg.bankclient;

import com.cg.bankapplication.MMBankFactory;
import com.cg.bankapplication.MMCurrentAcc;
import com.cg.bankapplication.MMSavingAcc;
import com.cg.bankframework.BankFactory;
import com.cg.bankframework.CurrentAcc;
import com.cg.bankframework.SavingAcc;

public class ClientBank {

	public static void main(String[] args) {
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(1001,"Ritu",5000,true);
		CurrentAcc c=new MMCurrentAcc(1001,"Ritu",5000, 1000);
		System.out.println("Saving Account: ");
		s.withdraw(400);
		System.out.println("Current Account: ");
		c.withdraw(400);
		
	}

}
