package com.tnsif.daysix.usingfinal;

final class FinalClass{
	
	void show()
	{
		System.out.println("Final class cannot be extended ");
	}
}

//class Demo extends FinalClass
//{
//	
//}

//can't crete a subclass of final parent class but create the obj of final class






public class FinalClassDemo {

	public static void main(String[] args) {
	
		FinalClass fc=new FinalClass();
		fc.show();

	}
}