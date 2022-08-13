package com.tns.strings;

import java.util.Scanner;

public class ConcatenateString {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		System.out.println("Hello"+"World"+10+20);
		System.out.println(str1.concat(str2));
		s.close();
		

	}

}
