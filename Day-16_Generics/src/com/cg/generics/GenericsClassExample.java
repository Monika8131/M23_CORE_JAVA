package com.cg.generics;
//Generic class Example
public class GenericsClassExample <T>
{
	T num;
	//method
	public void show() {
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		//instead of collection i have used generic class name and generic concepts
		GenericsClassExample <Double> obj= new GenericsClassExample <>();
		obj.num=13.8;
		obj.show();

	}

}
