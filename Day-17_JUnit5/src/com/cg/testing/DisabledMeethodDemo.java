package com.cg.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledMeethodDemo 
{
	@Test
	void display()
	{
		System.out.println("Not disabled");
	}
	@Disabled
	@Test
	void accept()
	{
		System.out.println("disabled");
	}
}
