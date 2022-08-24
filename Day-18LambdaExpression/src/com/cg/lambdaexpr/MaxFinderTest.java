package com.cg.lambdaexpr;

public class MaxFinderTest {

	public static void main(String[] args) {
		MaxFinder obj=(a,b)-> a>b?a:b;
		System.out.println("THe greatest value is: "+obj.maximum(23, 30));
		//int res=obj.maximum(22, 33);

	}

}
