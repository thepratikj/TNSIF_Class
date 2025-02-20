package com.tnsif.daysix.usingfinal;

public class FinalVariables {
	
	//final int a;
	
		final int x=100;
		
		//declare static final varibles 
		
		final static int y;
		
		final static int z=10;
		
		//instance method
		void change ()
		{
		//	x=200;
		//	y=10;
		}

		@Override
		public String toString() {
			return "FinalVariables [x=" + x + ",y=" + y+ "]";
		}
		
		//declare a static block to intialize the final static varible --y
		static {
			//x=56;
			//z=90;
		y=20;
			System.out.println("Value of Y : "+ y);
		}

}
