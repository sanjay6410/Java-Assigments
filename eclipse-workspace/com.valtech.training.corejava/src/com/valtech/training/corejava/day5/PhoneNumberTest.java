package com.valtech.training.corejava.day5;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PhoneNumberTest {
	PhoneNumber p= new PhoneNumber();
	List<Long> phNums = new ArrayList<>();
	
	@Test
	public void test() {
		phNums.add(1234567890L);
		phNums.add(7300422656L);
		int size=phNums.size();
		
		
		assertEquals(0,PhoneNumber.pNumber(size, phNums));
	}
	@Test
	public void test1() {
		phNums.add(1212121212L);
		phNums.add(9999999999L);
		phNums.add(7300422656L);
		int size=phNums.size();
		
		
		assertEquals(1,PhoneNumber.pNumber(size, phNums));
	}
	@Test
	public void test2() {
		phNums.add(1234567890L);
		phNums.add(9876543210L);
		int size=phNums.size();
		assertEquals(0,PhoneNumber.pNumber(size, phNums));
	}
	@Test
	public void test3() {
		phNums.add(9000099990L);
		phNums.add(7300422656L);
		int size=phNums.size();
		assertEquals(0,PhoneNumber.pNumber(size, phNums));
	}
	@Test
	public void test4() {
		phNums.add(1212121212L);
		phNums.add(7300422656L);
		int size=phNums.size();
		assertEquals(0,PhoneNumber.pNumber(size, phNums));
	}
	

}
