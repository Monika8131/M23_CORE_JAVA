package com.cg.inheritance;
//Program on Multilevel Inheritance
class Bike
{
	protected int speed;
	void display()
	{
		System.out.println("I like to drive a bike");
	}
}
class Pulser extends Bike
{
	protected String color;
	void print()
	{
		System.out.println("Speed is:" +speed);
	}
}
class Pulser185 extends Pulser
{
	void accept()
	{
		System.out.println("Color is"+color);
	}
}
public class MuliLevelInheritance {

	public static void main(String[] args) {
		Pulser185 p=new Pulser185();
		p.color="Black";
		p.speed=60;
		p.accept();
		p.display();
		p.print();

	}

}
