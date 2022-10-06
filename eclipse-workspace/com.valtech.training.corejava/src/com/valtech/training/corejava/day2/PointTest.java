package com.valtech.training.corejava.day2;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

public class PointTest {
	@Test
	public void testEquals()
	{
		Point p=new Point(2,3);
		Point p1=new Point(2,3);
		Point p2=p;
		assertTrue(p ==p2);
		assertFalse(p == p1);
		assertTrue(p.equals(p1));
		assertEquals(p.hashCode(), p1.hashCode());
		
	}
	@Test
	public void testDistance()
	{
		Point p=new Point();
		assertEquals(0.0,p.distance(null),0.000);
		p=new Point(10,20);
		assertEquals(Math.sqrt(10*10+20*20), p.distance(null),0.0001);
	}
	
	@Test
	public void testSetget()
	{
		
	}

	@Test
	public void testPointCtor() {
		//fail("Not yet implemented");
		Point p=new Point();
		assertEquals(0.0, p.getX(),0.00001);
		
	}

}
