package com.tnsif.dayseven.overriding;

//parent class
class Colour{
	
	protected Colour getColour()
	{
		Colour s=new Colour();
		return s;
	}
}

//child class
class Red extends Colour{
	
	protected Red getColour() {
		Red s=new Red();
		return s;
	}
}
class Yellow extends Colour{
	
	protected Yellow getColour() {
		Yellow s=new Yellow();
		return s;
	}
}



public class CovarientOverridingDemo {

	public static void main(String[] args) {
		
		Colour c=new Colour();
		System.out.println(c.getColour());
		
		Red r=new Red();
		System.out.println(c.getColour());

	}

}