package com.tnsif.dayfive.singleInheritance;

public class Country {
	
	//data members
		private String countryname;
		private String capital;
		
		//getter and setter 
		public String getCountryname() {
			return countryname;
		}
		public void setCountryname(String countryname) {
			this.countryname = countryname;
		}
		public String getCapital() {
			return capital;
		}
		public void setCapital(String capital) {
			this.capital = capital;
		}
		
		//to string 
		@Override
		public String toString() {
			return "Country [countryname=" + countryname + ", capital=" + capital + "]";
		}
		

}
