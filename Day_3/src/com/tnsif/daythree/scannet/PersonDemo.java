package com.tnsif.daythree.scannet;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		//scanner create object of scanner 
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Person name :");
		String name =sc.next();
		System.out.println("enter age :");
		int age=sc.nextInt();
		System.out.println("enter gender ");
		String gender=sc.next();
		
		System.out.println("eneter income ");
		int income =sc.nextInt();
		
		
		//person object objectr 
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		//display or else for getting the values we have two method 
		//getter and to String
		
		System.out.println(person);
		
		TaxCalculation calc=new TaxCalculation();
		calc.calculateTax(person); // tax calculated 
		
		System.out.println("After calculatioj of tax ");
		System.out.println(person);
		

	}

}