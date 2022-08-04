package com.cg.package4;
import com.cg.package3.HDFC;
//program in encapsulation
public class EncapuslationHDFC {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setAmount(56000);
		System.out.println("The amount in my account is:" +h.getAmount());

	}
	

}
