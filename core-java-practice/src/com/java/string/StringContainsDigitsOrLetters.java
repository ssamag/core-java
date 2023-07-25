package com.java.string;

public class StringContainsDigitsOrLetters {

	public static boolean isDigits(String str) {
		 // check for null & empty
        if(str == null || str.isEmpty() || str.length() == 0) {
            // return false
            return false;
        }
 
        // return if its any match
        return str.chars().anyMatch(ch -> Character.isDigit(ch));
	}
	
	public static boolean isChars(String str) {
		 // check for null & empty
       if(str == null || str.isEmpty() || str.length() == 0) {
           // return false
           return false;
       }

       // return if its any match
       return str.chars().allMatch(ch -> Character.isAlphabetic(ch));
	}
	
	public static boolean isCharsOrDigits(String str) {
		 // check for null & empty
      if(str == null || str.isEmpty() || str.length() == 0) {
          // return false
          return false;
      }

      // return if its any match
      return str.chars().anyMatch(ch -> (Character.isAlphabetic(ch)||Character.isDigit(ch)));
	}
	
	public static void main(String[] args) {
		
		 System.out.println("Whether \"Bench123\" contains digits :- "
	                + isDigits("Bench123"));
		 
		 System.out.println("Whether \"Bench123\" is only chars :- "
	                + isChars("Bench123"));
		 
		 System.out.println("Whether \"Bench123\" is  chars or digits :- "
	                + isCharsOrDigits("Bench123"));
		 
		 System.out.println("Whether \"&&&&\" is  chars or digits :- "
	                + isCharsOrDigits("&&&&"));
	}

}
