package com.cg.array;

public class CharArrrayDemo {

	public static void main(String[] args) {
		char arr[]= {'a','b','1','?','A',' '};
		for(int i=0;i<arr.length;i++)
		{
			if(Character.isDigit(arr[i]))
			{
				System.out.println(arr[i]+" is the digit");
			}
			if(Character.isLetter(arr[i]))
			{
				System.out.println(arr[i]+" is the letter");
			}
			if(Character.isWhitespace(arr[i]))
			{
				System.out.println(arr[i]+" is the whitespace");
			}
			if(Character.isUpperCase(arr[i]));
			{
				System.out.println(arr[i]+" is the uppercase");
			}
			if(Character.isLowerCase(arr[i]));
			{
				System.out.println(arr[i]+" is the lowercase");
			}
		}
		

	}

}
