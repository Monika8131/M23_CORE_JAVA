package com.cg.enums;

import java.util.Scanner;
//Example on enum with switch-Case
enum Movie
{
	//enum constants
	KGF2,BRAHMASHTRA,PUSHPA,Major;
}
public class EnumWithSwitchCase 
{
	//enum variable
	 Movie movie;
	//constructor for the "EnumWithSwitchCase" 
	public EnumWithSwitchCase(Movie movie)
	{
		// as Enum var and constructor argument var is same - "use this keyword"
		this.movie=movie;
	}
	
	//using switch to display the actor of the constants(movie)
	public void display()
	{
		switch(movie)
		{
			case KGF2:
				System.out.println("Yash and Srinidhi Shetty");
				break;
			case BRAHMASHTRA:
				System.out.println("Ranbir Kapoor and Ali Bhatt Kapoor");
				break;
			case PUSHPA:
				System.out.println("Allu Arjun and Rashmika");
				break;
			case Major:
				System.out.println("Adivi Sesh and Saiee Majrekar");
				break;
			default:
				System.out.println("Invalid movie name");
		}
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the movie name that you want to display");
		String str=s.nextLine();
		//valueOf();- to get the constant whose value is passed as an argument while calling this method
		EnumWithSwitchCase obj=new EnumWithSwitchCase(Movie.valueOf(str));
		obj.display();
		
	}

}
