package com.cg.array;

import java.util.Arrays;

public class UsingArray {
	static void display(int... a)
	{
		//Arrays.sort defines Array is a class and sort is the method which sort the values
		Arrays.sort(a);
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		display(12,6,88,9,23,56,71);

	}

}
