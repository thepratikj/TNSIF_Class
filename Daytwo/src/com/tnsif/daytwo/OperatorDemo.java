package com.tnsif.daytwo;

public class OperatorDemo {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int x=10;
		
		System.out.println("a and b values before the "
				+ "operator :"+ a+ "  "+ b);
		
	
		
		//increament and decreament ++ --
		//per incre ++a   post incre a++
		++a;
		
		//    12   20   12
		int c=++a + b + a--;
		System.out.println("Value of c : "+ c);
		
		
		//    44    11   20
		int d=c++ + a + b--;
		System.out.println("value of d : "+ d);

	}

}
