package com.tnsif.daythree.Constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		
		
		Customer c=new Customer();
		c.setCustomername("Zeel");
		c.setCustomerCity("Pune");
		c.setCustomerId(1001);
		
		System.out.println(c);
		
		Customer c1=new Customer("Aditya", 1002, "Mumbai");
		System.out.println(c1);

	}

}