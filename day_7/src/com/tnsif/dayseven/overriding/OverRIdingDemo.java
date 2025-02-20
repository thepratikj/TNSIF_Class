package com.tnsif.dayseven.overriding;

public class OverRIdingDemo {
	
public static void main(String[] args) {
		
		
		
		RBI rbi;
		
		//Dynamic binding assigning child class obj to parent class refer varibles
		
		rbi=new RBI();
		System.out.println(rbi.getRateOFInterest());
		
		rbi=new ICICi();
		System.out.println(rbi.getRateOFInterest());
		
		rbi=new SBI();
		System.out.println(rbi.getRateOFInterest());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateOFInterest());

	}

}
