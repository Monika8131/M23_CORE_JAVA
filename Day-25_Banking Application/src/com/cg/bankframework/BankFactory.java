package com.cg.bankframework;

public abstract class BankFactory 
{
	public abstract SavingAcc getNewSavingtAcc(int accNo, String accNm, float accBal, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit);

}