package com.tns.recursion;

import java.util.Scanner;

public class AssignmentQuestion2SumOfDigits {
	public static int sumOfDigits(int n){
		if(n == 0)
		{
			return 0;
		}
		
		return n % 10 + sumOfDigits(n/10);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int result = sumOfDigits(n);
		System.out.println(result);
		s.close();

	}

}
