package com.dayFour;

public class MethodsDemo {
	int n=23;
	
	//non-paramterized method
	public void addition()
	{
		int x=20;
		int y=10;
		int add=x+y;
		System.out.println("Addition of X and Y = "+ add);
		System.out.println(m);
	}
	public void multiply()
	{
		int x=20;
		int y=10;
		int mul=x*y;
		System.out.println("Multiplication of X and Y = "+ mul);
	}
	
	

	public static void main(String[] args) {
		MethodsDemo obj1 = new MethodsDemo();
		obj1.addition();
		obj1.multiply();

		// TODO Auto-generated method stub

	}

}
