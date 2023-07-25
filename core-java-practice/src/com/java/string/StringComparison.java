package com.java.string;

public class StringComparison {

	public static void main(String[] args) {

		String s1 = "Sandip";
		String s2 = "Sandip";
		String s3 = new String("Sandip");
		String s4 = new String("Rahul");

		// Comparison using ==
		System.out.println("s1==s2: " + (s1 == s2));
		System.out.println("s1==s3: " + (s1 == s3));
		System.out.println("s2==s3: " + (s2 == s3));

		// Comparison using equals method
		System.out.println("s1.equals(s2): " + s1.equals(s2));
		System.out.println("s1.equals(s3): " + s1.equals(s3));
		System.out.println("s2.equals(s3): " + s2.equals(s3));

		// Comparison using compareTo method
		System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));
		System.out.println("s1.compareTo(s3): " + s1.compareTo(s3));
		System.out.println("s2.compareTo(s3): " + s2.compareTo(s3));
		System.out.println("s2.compareTo(s4): " + s2.compareTo(s4));
		System.out.println("s4.compareTo(s2): " + s4.compareTo(s2));
		
		String strg1 = "hello";
		String strg2 = "";
		String strg = "me";
		 // compare with empty string, returns length of the string
		System.out.println("strg1.compareTo(strg2): " +strg1.compareTo(strg2));
		 // If first string is empty, result would be negative
		System.out.println("strg2.compareTo(strg): " +strg2.compareTo(strg));

		// comparison with null

		System.out.println("s1==null: " + (s1 == null));
		System.out.println("s1.equals(null): " + s1.equals(null));
		// System.out.println("s1.compareTo(null): " + s1.compareTo(null));

		// static method doesn't throws NPE

		/*
		 * When accessing a static member through an object reference expression, only
		 * the declared type of the reference matters. This means that:
		 * 
		 * It doesn't matter if the reference is actually null, since no instance is
		 * required
		 */

		// String Concatnation

		String str = null;
		System.out.println(str.valueOf(10));

		String s = new String("5");
		System.out.println(1 + 10 + s + 1 + 10);

		String numberSeven = new String("7");
		System.out.println(numberSeven + 10 + 1 + 10);

		String numberEight = new String("8");
		System.out.println(10 + numberEight + 1 + 10);

		// String Switch Case

		/*
		 * String str1 = null; switch (str1) { // #1 case "null":
		 * System.out.println("null string"); // #2 break; }
		 */
		// String intern() method

		String string1 = "hello";
		String string2 = new String("hello");

		string2 = string2.intern();
		System.out.println("string intern == :" + (string1 == string2));
		System.out.println("string intern equals:" + string1.equals(string2));
		
		//compare string with string buffer & string builder
		
		String stringAbc = "abc";
        StringBuffer stringBuffer = new StringBuffer(stringAbc);
        System.out.println(stringAbc.equals(stringBuffer));
        
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringAbc.equals(stringBuilder));
        
        String str1 = "Java";
        String str2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(sb1.toString() == str2);
        System.out.println(sb1.toString().equals(str1));

	}

}
