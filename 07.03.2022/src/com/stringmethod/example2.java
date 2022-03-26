package com.stringmethod;

public class example2 {

	public static void main(String[] args) {
		String text="Welcome to our office";
		String text1="welcome";
		String text2="our office";
		String text3="Welcome";
		
		System.out.println("compareTo method");
		System.out.println("***************************");
		System.out.println(text.compareTo(text1));
		
		System.out.println(text1.compareTo(text2));
		
		System.out.println(text.compareTo(text3));
		System.out.println("***************************");
		System.out.println("compareToIgnoreCase method");
		System.out.println("***************************");
		System.out.println(text.compareToIgnoreCase(text2));
	}

}
