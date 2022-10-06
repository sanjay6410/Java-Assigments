package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTestT {
	DateFormat df=new SimpleDateFormat("DD-MMM-YYYY HH:mm:SS");

	@Test
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
		
		System.out.println(df.format(date));
	}
	@Test
	public void testOldWay()
	{
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR,1947);
		cal.set(Calendar.MONTH,Calendar.AUGUST);
		cal.set(Calendar.DATE,15);
		Date date=cal.getTime();
		System.out.println(date);
		System.out.println(df.format(date));
	}
	@Test
	public void testDateFromString() throws ParseException
	{
		DateFormat df=new SimpleDateFormat("dd-MM-YYYY");
		Date date=df.parse("15-08-1947");
		System.out.println(date);
		
	}

}
