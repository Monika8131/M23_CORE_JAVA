package com.cg.application;

import com.cg.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("GSPrimeAcc [toString()=%s]", super.toString());
	}

	@Override
	public void bookPorduct(float charges) {
		// TODO Auto-generated method stub
		
	}

	

	
	
	
	
}
