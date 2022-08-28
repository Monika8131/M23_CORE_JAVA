package com.cg.annotations;

class Animal
{
	//Non-Parameterized Constructor
	Animal()
	{
		System.out.println("Lions");
	}
	/*public void sound()
	{
		System.out.println("Roars");
	}*/
}
public class SuppressWarningAnnotations {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		//will remove the compiler warning
		Animal a=new Animal();

	}

}
