package com.java.string;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
	
	public static boolean isPalindrome(String str) {
		String orgString = str;
		String newString = new StringBuilder(str).reverse().toString();
		return orgString.equals(newString);
	}

	public static void main(String[] args) {
		
		//using string builder & prior java 8
		
		StringBuilder strb = new StringBuilder("India");
		System.out.println("<---Reversed String is: " + strb.reverse().toString());
		
		//using java8 lambada
		
		String reversedString = Stream.of("India").map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining(""));
		
		System.out.println("<---Reversed String using lambda is: " + reversedString);
		
		//reversing each word in the string
		
		String indiaDescr = "india is great";
		String reverseIndiaDescr = Arrays.stream(indiaDescr.split(" ")).map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining(" "));
		
		System.out.println("<---Reversed each String using lambda is: " + reverseIndiaDescr);
		
		System.out.println("<----isPalindrome(\"radar\"): " + isPalindrome("radar"));
		
		System.out.println("<----isPalindrome(\"apple\"): " + isPalindrome("apple"));
	}

}
