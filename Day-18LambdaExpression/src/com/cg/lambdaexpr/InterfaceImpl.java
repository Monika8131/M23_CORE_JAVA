package com.cg.lambdaexpr;

interface C
{
	/*Lambda expression will only work for Functional
	Interface Implementation not for other Interface*/
	//void accept();
	void display();
	
}
public class InterfaceImpl {

	public static void main(String[] args) {
		//The target type of this expression must be a functional interface
		C obj=()->
		{
			System.out.println("Functional interface implementation without\" +\"Lambda Expression");
		};
		obj.display();

	}

}
