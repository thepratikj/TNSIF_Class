package com.tnsif.daysix.staticblockmethod;

public class MyClass {

private int section; // non static or instance varible 
	
	private static int srNo;
	
	//static block 
	static
	{
		System.out.println("---Within static block----");
		//section=200;
		srNo=1000;
		
	}
	
	//default constructor 
	MyClass()
	{
		System.out.println("----Within default constructor----");
		srNo++;
		section++;
		
	}

	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+",section=" + section + "]";
	}
	
	static void display()
	{
		//System.out.println("Section : "+ section);
		System.out.println("Serial No : "+srNo);
	}
}
