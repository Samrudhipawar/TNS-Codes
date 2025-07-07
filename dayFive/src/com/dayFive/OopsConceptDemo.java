package com.dayFive;

public class OopsConceptDemo {
	
	private int serialNum;
	private String name;
	private int Age;
	
	
	//Getter & Setter
	
	public void setSerialNum(int serialNum)
	{
		this.serialNum=serialNum;
	}
	
	public int getSerialNum()
	{
		return serialNum;
	}

	@Override
	public String toString() {
		return "OopsConceptDemo [serialNum=" + serialNum + ", name=" + name + ", Age=" + Age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

}
