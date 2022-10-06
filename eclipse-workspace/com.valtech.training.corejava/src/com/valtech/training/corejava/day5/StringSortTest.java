package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class StringSortTest {
	
	@Test
	public void testAlphabetCount()
	{
		String [] data=new String[] {};
		Arrays.sort(data,new StringSort());
		assertArrayEquals(new String[] {""}, data);
	}
	
	@Test
	public void testVowels()
	{
		String [] data=new String[] {"Abc","Pqr","Lmno","Too","Ab","z"};
		Arrays.sort(data,new StringSort());
		assertArrayEquals(new String[] {"z", "Ab","Pqr","Abc","Too","Lmno"},data);
		
	}

	@Test
	public void testLength() {
		String[] data=new String[] {"ab","abcd","a","abc"};
		System.out.println(Arrays.asList(data));
	    Arrays.sort(data,new StringSort());
	    System.out.println(Arrays.asList(data));
	    assertArrayEquals(new String[] {"a","ab","abc","abcd"},data);
	}

}
