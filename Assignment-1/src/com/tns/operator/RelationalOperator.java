package com.tns.operator;
//Program on relational Operator
import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		boolean res=a>b;
		System.out.println(res);
		s.close();

	}

}
