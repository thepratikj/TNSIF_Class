package com.tnsif.daytwo;

public class NestedIfElse {
	public static void main(String[] args) {
	
		
		int a=10, b=20, c=55;
		
		System.out.println("The largest no is :");
		if(a> b)
		{
			if(a>c)
			{
				System.out.println(a);
			}
			else 
			{
				System.out.println(c);
			}
		}
		else 
		{
			if(c>b)
			{
				System.out.println(c);
			}
			else 
			{
				System.out.println(b);
			}
		}
		
	}
}
