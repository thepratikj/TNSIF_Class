package com.tnsif.daythree.Constructor;

public class OopsConcept {
	
	//data members
		private int serailnum;
		private String name;
		private int age;
		public int getSerailnum() {
			return serailnum;
		}
		public void setSerailnum(int serailnum) {
			this.serailnum = serailnum;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		//tostring 
		@Override
		public String toString() {
			return "OopsConceptdemo [serailnum=" + serailnum + ", name=" + name + ", age=" + age + "]";
		}

}
