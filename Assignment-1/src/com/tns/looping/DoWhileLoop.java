package com.tns.looping;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		do
		{
			System.out.println("Value of a:"+a);
			a++;
		}
		while (a<25);
		s.close();

	}

}
