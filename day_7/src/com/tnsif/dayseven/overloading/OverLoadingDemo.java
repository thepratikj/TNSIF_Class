package com.tnsif.dayseven.overloading;

public class OverLoadingDemo {

public static void main(String[] args) {
		
		System.out.println("------constructor overloading----------");
		
		Point p=new Point(); // dfefault 
		System.out.println(p);
		
		Point p1=new Point(14.5f);
		System.out.println(p1);
		
		Point p2=new Point(12.5f, 20.87f);
		System.out.println(p2);
		
		
		System.out.println("--------------Method Overloading------------");

		System.out.println("Addition of two int no : "+ MethodOverLoading.addition(10, 20));
		System.out.println(MethodOverLoading.addition(12.5f, 34.87f));
		System.out.println(MethodOverLoading.addition("Hello ", "All"));
	}
}
