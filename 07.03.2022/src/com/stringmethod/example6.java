package com.stringmethod;

public class example6 {

	public static void main(String[] args) {
		String text="Welcome to our office";
		String text1="Welcome to our office";
		String text2="our office";
		String text3="welcome to our office";
		
		
		 System.out.println("equals method ");
			System.out.println("***************************");
		System.out.println(text.equals(text1));
		
		System.out.println(text1.equals(text2));
		
		System.out.println(text.equals(text3));
		System.out.println("***************************");
		System.out.println("equalsIgnoreCase method");
		System.out.println("***************************");
		System.out.println(text.equalsIgnoreCase(text3));
	}

}
