package com.cg.abstractkeywordDemo;
//concrete class
class Sweet extends RasMalai
{
	public Sweet()
	{
		System.out.println("I like RasMalai");
	}
	//non-abstract method
	public String taste()
	{
		return "Sweet";
	}
	//implementation for the abstract method
	void display()
	{
		System.out.println("Hey guys, The Food is sweet");
	}
	void print()
	{
		System.out.println("Sweet is RasMalai");
	}

}
