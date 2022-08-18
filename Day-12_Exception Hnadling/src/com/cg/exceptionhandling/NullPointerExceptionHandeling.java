package com.cg.exceptionhandling;



public class NullPointerExceptionHandeling {

	public static void main(String[] args) {
		
		String str=null;
	try
	{
		str.equals("JAVA");
	}
	catch(Exception e)
	{
		//allocated a new value to str as "JAVA"
		str=new String("JAVA");
		System.out.println(str.equals("JAVA"));
	}

	}

}
