package com.cg.superdemo;

public class Base2 extends Base1{
	Base2()
	{
		super();//call to parent class default constructor
		System.out.println("Defult constructor for Base2");
		
	}
	Base2(int i)
	{
		super(i);//call to parent class parameter constructor
		System.out.println("Parametrized constructor for Base2:"+i);
	}

}
