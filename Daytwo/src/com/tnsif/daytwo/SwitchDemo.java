package com.tnsif.daytwo;

public class SwitchDemo {
	public static void main(String[] args) {
		
		char x='s';
		
		switch(x)
		{
		case 'l':
		case 'L':
			System.out.println(x + "is a leader");
			break;
			
		case 'a':
		case 'A':
			System.out.println(x + "is a Apps");
			break;
			
		case 'b':
		case 'B':
			System.out.println(x + "is a BootStraps");
			break;
			
		case 'h':
		case 'H':
			System.out.println(x + "is a HTML");
			break;
			
			default:
				System.out.println(x + "is other then the letters given ");
				break;
		}

	}

}
