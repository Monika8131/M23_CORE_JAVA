package com.tns.collection;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

	public static void main(String[] args) {
		NavigableMap<Integer,String>s=new TreeMap<Integer,String>();
		s.put(15, "Monika");
		s.put(12, null);
		//s.remove(12);
		System.out.println(s);
		System.out.println(s.lastEntry());

	}

}
