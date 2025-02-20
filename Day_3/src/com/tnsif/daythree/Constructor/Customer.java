package com.tnsif.daythree.Constructor;

public class Customer {
	
	//data memebers
		private String customername;
		private int customerId;
		private String customerCity;
		
		//default constructor
		public Customer() {
			System.out.println("Default constructor ");
		}

		//para constructor
		public Customer(String customername, int customerId, String customerCity) {
			System.out.println("Para Constructor ");
			this.customername = customername;
			this.customerId = customerId;
			this.customerCity = customerCity;
		}

		//getter and setter 
		public String getCustomername() {
			return customername;
		}

		public void setCustomername(String customername) {
			this.customername = customername;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public String getCustomerCity() {
			return customerCity;
		}

		public void setCustomerCity(String customerCity) {
			this.customerCity = customerCity;
		}

		//to string 
		@Override
		public String toString() {
			return "Customer [customername=" + customername + ", customerId=" + customerId + ", customerCity="
					+ customerCity + "]";
		}
		

}
