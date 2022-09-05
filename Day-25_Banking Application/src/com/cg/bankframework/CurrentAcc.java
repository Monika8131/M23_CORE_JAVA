package com.cg.bankframework;

public abstract class CurrentAcc extends BankAcc
{
private final float creditLimit;
private int Accbal;
//constructor
public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
	super(accNo, accNm, accBal);
	this.creditLimit = creditLimit;
}



@Override
public String toString() {
	return "CurrentAcc [creditLimit=" + creditLimit + "]";
}


//method
public void withdraw(float withdrawAmu)
{
	if(withdrawAmu>=creditLimit)
	{
		System.out.println("Your credit limit is "+creditLimit);
	}
	else
	{
		System.out.println("Account no"+this.getAccNo()+" Account name "+this.getAccNm()+" Account Balance "+(this.getAccBal()-withdrawAmu)+" With Maximum CreditLimit Rs "+creditLimit);
	}
}
}
