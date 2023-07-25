package com.java.string;

public class StringConversionsExample {

	public static void main(String[] args) {
		
		/* 
		 * other data types to string conversion*/
		
		long longVar = 500l;
		
		//using wrapper class toString() method
		System.out.println("<--- Long.toString(longVar): " +  Long.toString(longVar));
		
		//using String.valueOf() method
		
		System.out.println("<--- String.valueOf(longVar): " +  String.valueOf(longVar));
		
		//using String.format() method
		
		System.out.println("<--- String.format(\"%d\",longVar): " +  String.format("%d",longVar));
		
		//using stringbuilder
		
		StringBuilder strb = new StringBuilder();
		System.out.println("<--- strb.append(longVar).toString(): " +  strb.append(longVar).toString());
		
		//using stringbuffer
		
		StringBuffer stringBuffer = new StringBuffer();
		System.out.println("<--- stringBuffer.append(longVar).toString(): " + stringBuffer.append(longVar).toString());
		
		/* 
		 * string to other data types conversion*/
		
		String str = "1234";
		
		//using wrapper class parseLong() method
		System.out.println("<---  Long.parseLong(str): " +  Long.parseLong(str));
		
		//using Long.valueOf() method
		System.out.println("<---  Long.valueOf(str): " +  Long.valueOf(str));
				
		
		

	}

}
