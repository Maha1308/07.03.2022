package com.stringmethod2;

public class exp10 {

	public static void main(String[] args) {
String message = " Hello How are you, I am fine, thank you ";


String words[] = message.split("\\s");

for(String word: words)
{
	System.out.println(word);
}

	}

}
