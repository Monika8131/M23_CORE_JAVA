package com.cg.annotations;

class Car
{
	void speed(int s)
	{
		System.out.println("Speed is: "+s+"km/hr");
	}
}
class BMW extends Car
{
	//@Override annotations is giving the extra information about the method
	@Override
	void speed(int str)
	{
		System.out.println("Speed is: "+str+"km/hr");
	}
}
public class OverrideAnnotationsExample 
{
	public static void main(String[] args) {
	BMW b=new BMW();
	b.speed(60);
	

}
}