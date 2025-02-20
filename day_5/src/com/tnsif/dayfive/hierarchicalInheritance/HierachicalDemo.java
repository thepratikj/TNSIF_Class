package com.tnsif.dayfive.hierarchicalInheritance;

public class HierachicalDemo {
public static void main(String[] args) {
		
		
		Person p1=new Person();
		System.out.println("---Person Details ------");
		System.out.println(p1);
		
		Person p;
		p=new Person("vaishnavi", "Mumbai");
		System.out.println("person Details :"+ p);
		
		p=new Student("Nikita", "Pune", "SY", 78.98f);
		System.out.println(p);
		
		p=new Employee("ANiket", "Nashik", 1002, 60000f, "developer");
		System.out.println(p);

	}


}
