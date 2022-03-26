package com.stringmethod;

public class example5 {

	public static void main(String[] args) {
		String text="Welcome to our office";
		System.out.println("endwith method");
		 
		System.out.println(text.endsWith("to our office"));

		System.out.println(text.endsWith("To"));
		
		System.out.println(text.endsWith("office"));
		System.out.println(text.endsWith("Welcome"));
	}

}
