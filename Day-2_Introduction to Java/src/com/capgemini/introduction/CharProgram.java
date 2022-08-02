package com.capgemini.introduction;

import java.util.Scanner;

public class CharProgram {

	public static void main(String[] args) {
		//compile time input
		//char x='a';
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character x:");
		
		//run time input
		char x=s.next().charAt(0);
		System.out.println("The character is x:" +x);
		

	}

}
