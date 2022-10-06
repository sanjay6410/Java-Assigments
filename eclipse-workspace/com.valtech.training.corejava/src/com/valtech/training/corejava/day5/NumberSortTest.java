package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class NumberSortTest {

	@Test
	public void test() {
		Integer [] data=new Integer[] {57,32,2,-1,46,71,1,-7};
		System.out.println(Arrays.asList(data));
		//Arrays.sort(data,new NumberSort());
		Arrays.sort(data,new NumberSort());
		System.out.println(Arrays.asList(data));
		assertArrayEquals(new Integer[]  {-7,-1,1,57,71,46,32,2}, data);
	}

}