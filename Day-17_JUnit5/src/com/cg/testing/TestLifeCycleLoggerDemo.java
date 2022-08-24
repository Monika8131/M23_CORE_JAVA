package com.cg.testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
public interface TestLifeCycleLoggerDemo 
{
	@AfterEach
	default void AferEach()
	{
		System.out.println("Hey! I am learning after each test life cycle logger");
	}
	
	@BeforeAll
	default void BeforeEach()
	{
		System.out.println("Hey! I am learning before each test life cycle logger");
	}

}
