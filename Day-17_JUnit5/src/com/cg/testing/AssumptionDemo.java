package com.cg.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo 
{
	@Test
	void divison()
	{
		System.setProperty("Krutika", "Monika");
		//if assumption is true then printing statement will print otherwise not
		Assumptions.assumeTrue("Monika".equals(System.getProperty("Krutika")));
		System.out.println("Assumption is True");
		//if assumption is true then printing statement will print otherwise not
		//Assumptions.assumeFalse("Monika".equals(System.getProperty("Kriti")));
		//System.out.println("Assumption is False");
	}
}
