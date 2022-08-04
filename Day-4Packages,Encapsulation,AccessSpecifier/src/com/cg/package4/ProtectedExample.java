package com.cg.package4;

class Car
{
	protected int a=15;
	//if any variable and method is protected we can access inside the child class
	protected void print()
	{
		System.out.println("Hey, I am using the access specifier");
	}
}
class Mercedes extends Car
{
	void print1()
	{
		System.out.println(a);
	}
	//Mercedes class is accessing the properties of Car class
}
class D
{
	public void print2()
	{
		System.out.println(a);
	}
	int a;
}
public class ProtectedExample {

	public static void main(String[] args) {
		Mercedes m=new Mercedes();
		m.print();
		m.print1();

	}

}
