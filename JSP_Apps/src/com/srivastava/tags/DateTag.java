package com.srivastava.tags;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTag {
	private DateTag(){}
	public static String printDate(String lang, String country){
		Locale locale = new Locale(lang,country);
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locale);
		String formattedDate = df.format(date);
		return formattedDate;
		
		
	}

}
