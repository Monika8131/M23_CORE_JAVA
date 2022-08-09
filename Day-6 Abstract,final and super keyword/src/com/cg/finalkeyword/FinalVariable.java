package com.cg.finalkeyword;
//Program on Final Variable
public class FinalVariable {
	final int FIN_VAR=45;
	/*public void print()
	{
	//if any variable is declared as final we can't change the value of that particular variable
		FIN_VAR=76;
	}*/

	public static void main(String[] args) {
		
		FinalVariable f=new FinalVariable();
		
		System.out.println(f.FIN_VAR);
		

	}

}
