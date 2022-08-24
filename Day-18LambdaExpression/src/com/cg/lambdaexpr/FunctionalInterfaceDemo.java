package com.cg.lambdaexpr;

//functional Interface
@FunctionalInterface
interface D
{
	String display(String str);//abstract method
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		//Lambda Expression with return statement
		D obj=(String str)->
		{
			return str;
		};
		System.out.println(obj.display("Welcome to Lambda Expression Concept"));
		
	}

}
