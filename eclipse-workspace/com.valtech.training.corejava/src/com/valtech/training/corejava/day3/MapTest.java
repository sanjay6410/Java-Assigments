package com.valtech.training.corejava.day3;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

import com.valtech.training.corejava.day1.Point;

public class MapTest {
	
	
	@Test
	public void testTreeMap()
	{
		
	}

	@Test
	public void testHashMap() 
	{
		Map<String,Point> points =new TreeMap();  //from HashMap to Treemap
		points.put("1,1", new Point(1,1));
		points.put("1,2", new Point(1,1));
		points.put("2,2", new Point(1,1));
		points.put("1,2", new Point(1,1));
		assertEquals(3, points.size());
		//for(Map.Entry<String, Point>)
		Set<String> keys=points.keySet();
		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			System.out.println("Key " +key+" Value "+points.get(key));
			
		}
		
		
		
	}

}
