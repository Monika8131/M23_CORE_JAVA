package com.tns.multithreading;

public class ThreadExample extends Thread{
	public void run()
	{
		System.out.println("Thread is going to run");
	}
	public static void main(String[] args) {
		
		ThreadExample t=new ThreadExample();
		t.start();

	}

}
