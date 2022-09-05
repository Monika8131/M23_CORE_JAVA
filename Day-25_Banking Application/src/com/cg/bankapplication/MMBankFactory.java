package com.cg.bankapplication;

import com.cg.bankframework.BankFactory;
import com.cg.bankframework.CurrentAcc;
import com.cg.bankframework.SavingAcc;

public class MMBankFactory extends BankFactory
{

	@Override
	public SavingAcc getNewSavingtAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc c=new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return c;
	}


}
