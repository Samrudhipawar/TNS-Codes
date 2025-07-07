package com.daySix;

public class Customer {
	String name;
	int id;
	
	public static void main(String[] args) {
        // Create a Customer object
        Customer cust = new Customer("Samrudhi", 101);
        // Call the method
        cust.displayInfo();
    }


	 public Customer(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    public void displayInfo() {
	        System.out.println("Customer Name: " + name);
	        System.out.println("Customer ID: " + id);
	    }
}
