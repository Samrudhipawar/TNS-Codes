package com.dayFour;

public class SwitchDemo {

	public static void main(String[] args) {
		char x='D';
		switch(x)
		{
		case 'l':
			System.out.println("This code contains letters");
			break;
		case 'd':
			System.out.println("This code contains digits");
			break;
		case 's':
			System.out.println("This code contains symbols");
			break;
		case 'w':
			System.out.println("This code contains whitespaces");
			break;
		default:
			System.out.println("This code doesnt contains any letters,digits,symbols or whitespaces");
			//break;

	}
}

}
