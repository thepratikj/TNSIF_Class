package com.tnsif.dayeight.abstractclassdemo;

public class Rectangular extends Shape {

	float width;
	float height;
	
	
	public Rectangular()
	{
		width=3.2f;
		height=2.0f;
		
	}
	
	public Rectangular(float width, float height)
	{
		this.width=width;
		this.height=height;
	}
	
	
	
	@Override
	public void calArea() {
		this.area=width*height;
		
	}

}