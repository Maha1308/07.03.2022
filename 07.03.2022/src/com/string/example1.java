
package com.string;
public class example1 {

	public static void main(String[] args) {

		String text = "Welcome to our home";
		
		byte b1[] = text.getBytes();
		
		for(byte b: b1)
		{
			System.out.println(b);
		}
	}
}