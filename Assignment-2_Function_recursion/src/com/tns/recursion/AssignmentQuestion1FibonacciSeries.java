package com.tns.recursion;

import java.util.Scanner;

public class AssignmentQuestion1FibonacciSeries {
	static int a=0, b=1, c=0;
		
		static void printFibo(int n)
		{
			if(n>0) {
				c = a + b;
				a = b;
				b = c;
				System.out.print(" "+c);
				printFibo(n-1);
			}
}

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(a+" "+b);
		printFibo(n-2);
		s.close();
	}
	
}
