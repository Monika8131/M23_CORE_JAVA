package com.cg.polymorphism;
//program on method overriding
//one class is not enough create two-or more class which contains inheritance concepts
class Multiplaction
{
	void accept(int a, int b)
	{
		System.out.println(a*b);
	}
}
class Mult extends Multiplaction
{
	void accept(int x, int y)
	{
		System.out.println(x*y);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Mult m=new Mult();
		m.accept(12, 5);
		Multiplaction m1=new Multiplaction();
		m1.accept(4, 6);

	}

}
