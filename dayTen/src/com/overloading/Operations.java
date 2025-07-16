//program to define overloaded methods for palindrome check
package com.overloading;

public class Operations {
	public static boolean isPalindrome(int number)
	{
		int rev = 0;
		int dummyNumber = number;
		while(number != 0)
	{
		rev = rev*10+number%10;
		number /= 10;
		
	}
		return dummyNumber == rev;
	}
	
	public static boolean isPalindrome(String str) 
	{
		
		String rev;
		rev = new StringBuffer(str).reverse().toString();
		return str.equals(rev);
	}
}
