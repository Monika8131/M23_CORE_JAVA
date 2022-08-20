package com.tns.multithreading;

class Test extends Thread
{
	public void run()
	{
		System.out.println("Thread pass");
	}
}
public class ExceptionThread {

	public static void main(String[] args) {
		Test create=new Test();
		create.start();
		create.start();

	}

}
