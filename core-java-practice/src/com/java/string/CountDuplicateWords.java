package com.java.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountDuplicateWords {

	public static void main(String[] args) {

		String str = "orange juice apple juice mango juice";
		String[] strArray = str.split("\\s");

		// Word count using Java 8 stream api
		System.out.println(strArray);
		Map<String, Long> strMap = Arrays.stream(strArray)
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));
		System.out.println("<----Word Counts Are: " + strMap);
		
		//Remove duplicate using java8 stream api
		Set<String> uniqueStringSet = Arrays.stream(str.split(" ")).collect(Collectors.toSet());
		System.out.println("<---Unique words are: " + String.join(" ", uniqueStringSet));

		// Remove duplicate words using set
		List<String> strList = Arrays.asList(strArray);
		Set<String> uniqueWords = new HashSet<>(strList);
		uniqueWords.forEach(w -> System.out.println(w));
		String uniqueString = String.join("\s", uniqueWords);
		System.out.println("<----String after removal of duplicates: " + uniqueString);

		// Word count using Collections api
		System.out.println("<----Word count using collections api: ");
		for (String word : uniqueWords) {
			System.out.println(word + ": " + Collections.frequency(strList, word));
		}

		// Remove duplicate characters from string

		String dupCharString = "india";
		Set<String> charSet =  Arrays.stream(dupCharString.split("")).collect(Collectors.toSet());
		String finalString = String.join("", charSet);
		System.out.println("<----String after removal of duplicates chars: " + finalString);

	}

}
