package com.cg.bankframework;

public abstract class BankAcc {
	private int AccNo;
	private String AccNm;
	private float AccBal;

	// constructor
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.AccNo = accNo;
		this.AccNm = accNm;
		this.AccBal = accBal;
	}

	public int getAccNo() {
		return AccNo;
	}

	public void setAccNo(int accNo) {
		this.AccNo = accNo;
	}

	public String getAccNm() {
		return AccNm;
	}

	public void setAccNm(String accNm) {
		this.AccNm = accNm;
	}

	public float getAccBal() {
		return AccBal;
	}

	public void setAccBal(float accBal) {
		this.AccBal = accBal;
	}
	

	@Override
	public String toString() {
		return "BankAcc [accNo=" + AccNo + ", accNm=" + AccNm + ", accBal=" + AccBal + "]";
	}


}
