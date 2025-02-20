package com.tnsif.daysix.staticblockmethod;

public class Employee {

	//declare instance varible
	
		private String name;
		private int id;
		
		//declare a static varible companyName with data type as an string 
		
		
		static String companyName="TNS";

		public Employee(String name, int id) {
			
			this.name = name;
			this.id = id;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ",company= " + companyName+"]";
		}
}
