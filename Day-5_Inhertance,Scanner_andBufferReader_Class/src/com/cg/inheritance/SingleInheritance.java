package com.cg.inheritance;
//program on single Inheritance
class Parent
{
	protected int rollno;
	void print()
	{
		System.out.println("Hey Geys! I am learning Java");
	}
}
class Child extends Parent
{
	void accept()
	{
		System.out.println("roll no is:"+rollno);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Child c=new Child();
		c.rollno=12;
		c.accept();
		c.print();

	}

}
