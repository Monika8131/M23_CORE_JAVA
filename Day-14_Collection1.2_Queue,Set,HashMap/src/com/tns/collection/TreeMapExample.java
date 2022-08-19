package com.tns.collection;

import java.util.HashMap;
import java.util.Map;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<Integer,String>s=new HashMap<Integer,String>();
		s.put(15, "Monika");
		s.put(12, null);
		//s.remove(12);
		System.out.println(s);

	}

}
