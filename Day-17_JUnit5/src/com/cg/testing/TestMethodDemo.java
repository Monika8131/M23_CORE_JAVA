package com.cg.testing;

import org.junit.jupiter.api.Test;

public class TestMethodDemo implements TestLifeCycleLoggerDemo 
{
	@Test
	void print()
	{
		System.out.println("Hey! I am learning Junit5");
	}

}
