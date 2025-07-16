package com.dayNine;

public class FinalVariable {
	//final instance varibale
	final int x = 100;
	
	final static int y=20;
	//order can be changed as also static final nd vice versa
	
	void display() {
		//x=20;
		System.out.println(x);
		}
	{
		System.out.println("final keyword");
		
	}

	public FinalVariable() {
		super();
	}

	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
		f.display();
			
}
}
