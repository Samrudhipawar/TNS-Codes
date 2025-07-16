package com.overriding;

public class Square extends Shape{
	private double side;
	public Square(double side) {
		super();
		this.side = side;
	}
	
	//override draw method
	
	public void draw() {
		System.out.println("Drawing a circle with radius= "+side);
	}
	
	 

	public void erase() {
		System.out.println("Erasing a circle with radius= "+side);
	}

}
