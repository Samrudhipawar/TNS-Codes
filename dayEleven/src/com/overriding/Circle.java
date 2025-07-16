package com.overriding;

public class Circle extends Shape {
	private double radius;
//constru for radi
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	//override draw method
	
	public void draw() {
		System.out.println("Drawing a circle with radius= "+radius);
	}
	
	 

	public void erase() {
		System.out.println("Erasing a circle with radius= "+radius);
	}
}
	