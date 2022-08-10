package com.cg.statickeyword;

public class StaticBlock {
	static int num;
	static String str;
	//static block: if you want to initialize the value without using the constructor and obj.creation
	//then use static block
	//and the variable of the class static
	static
	{
		num=15;
		str="Monika";
	}
	/*StaticBlock()
	{
		num=15;
		str="Monika";
	}*/

	public static void main(String[] args) {
		//StaticBlock s=new StaticBlock();
		//System.out.println(s.num);
		//System.out.println(s.str);
		System.out.println(num);
		System.out.println(str);

	}

}
