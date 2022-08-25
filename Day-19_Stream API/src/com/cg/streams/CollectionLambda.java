package com.cg.streams;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambda {

	public static void main(String[] args) {
		Set<Integer> obj= new HashSet<>();
		obj.add(67);
		obj.add(23);
		obj.add(44);
		System. out.println(obj);
		/*If i want to extract the set values we can go ahead with Iterator, while loop and 
		 * for loop but using stream API-forEach() method we can do it in a one line
		 */
		//Extracting the values from set
		obj.forEach(System.out::println);
		
	}

}
