package com.valtech.training.corejava.day4;

import static org.junit.Assert.*;
import com.valtech.training.corejava.day1.*;

import org.junit.Test;

import com.valtech.training.corejava.day1.Point;

public class ReflectTest {

	@Test
	public void test() throws InstantiationException, IllegalAccessException {
    Point p=Point.class.newInstance();
    System.out.println(p);
	}

}
