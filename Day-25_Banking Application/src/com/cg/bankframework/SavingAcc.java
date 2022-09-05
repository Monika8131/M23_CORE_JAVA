package com.cg.bankframework;

public abstract class SavingAcc extends BankAcc
{
private boolean isSalaried;
private float withdraw;
private float accBal;
static final private float MINBAL=500.0f;
//constructor
public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
	super(accNo, accNm, accBal);
	this.isSalaried = isSalaried;
}

	
//method
public void withdraw(float withdrawAmu)
{
	if(accBal<MINBAL)
	{
		System.out.println("Account Balance Minimum Limit"+MINBAL);
	}
	else
	{
		System.out.println("Account no"+this.getAccNo()+" Account name "+this.getAccNm()+" Account Balance "+(this.getAccBal()-withdrawAmu));
	}
}
@Override
public String toString() {
	return "SavingAcc [isSalaried=" + isSalaried + "]";
}

}
