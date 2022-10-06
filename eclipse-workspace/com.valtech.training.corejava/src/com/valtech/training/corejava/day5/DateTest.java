package com.valtech.training.corejava.day5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	
	//@Test
	public void testDate()
	{
		Date date=new Date();
		System.out.println(date);
		/*
		 * HH-HOUR
		 * mm -Minute
		 * SS-seconds
		 * YY /YYY -Year
		 * MM /MMM-Month
		 * DD -Day
		 */
		DateFormat df=new SimpleDateFormat("DD-MMM-YYYY HH:mm:SS");
		System.out.println(df.format(date));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
