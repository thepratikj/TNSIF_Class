package com.tnsif.dayfive.singleInheritance;

//child State
public class City extends State {

	
	//data members
	
	private String cityName;
	private float area;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public float getArea() 
	{
		return area;
	}
	
	public void setArea(float area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", area=" + area + ", getStateName()=" + getStateName()
				+ ", getLanguage()=" + getLanguage() + ", getCountryname()=" + getCountryname() + ", getCapital()="
				+ getCapital() + "]";
	}
	
}