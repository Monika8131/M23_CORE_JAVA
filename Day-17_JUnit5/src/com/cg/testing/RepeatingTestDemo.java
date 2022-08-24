package com.cg.testing;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatingTestDemo 
{
	//it will repeat the test for given set of times
	@RepeatedTest(5)
	void print()
	{
		System.out.println("Hello, I am learning Repeating annotation");
	}
}
