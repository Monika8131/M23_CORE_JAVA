package com.tns.strings;

import java.util.Scanner;

public class StringUpperCaseMethod {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String str1=s.nextLine();
		System.out.println(str1.length());
		System.out.println(str1.charAt(2));
		System.out.println(str1.toUpperCase());
		s.close();

	}

}
