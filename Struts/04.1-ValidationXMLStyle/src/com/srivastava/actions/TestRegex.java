package com.srivastava.actions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {
		 String line = "1234Hello";
	      String pattern = "[0-9]+";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	        System.out.println("Found");
	      } else {
	         System.out.println("NO MATCH");
	      }

	}

}
