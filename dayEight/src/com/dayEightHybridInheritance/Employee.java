package com.dayEightHybridInheritance;

public class Employee extends Person{
	
	int empid=101;
	String companyName="TNS";
	
	
	public void empDetails()
	{
		System.out.println(empid+ " "+name+" "+adharno+" "+phno+" "+companyName);
		
	}

}
