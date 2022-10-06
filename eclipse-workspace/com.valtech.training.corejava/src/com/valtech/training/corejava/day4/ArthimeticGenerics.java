package com.valtech.training.corejava.day4;

import com.valtech.training.corejava.day1.Point;

public class ArthimeticGenerics<E extends Number> {
	
	public double add(E a,E b)
	{
//		return a.toString()+b.toString();
		return a.doubleValue()+b.doubleValue();
	}
	public <F> void print(F obj)
	{
		System.out.println("Recd.....Class "+ obj.getClass().getName()+" "+obj);
	}
	public static void main(String[] args) {
		ArthimeticGenerics<Integer> a=new ArthimeticGenerics<>();
		System.out.println(a.add(2, 3));
		System.out.println(new ArthimeticGenerics<Double>().add(2.3, 4.6));
//		System.out.println(new ArthimeticGenerics<Point>().add(new Point(2,3),new Point(3,5)));
		a.print("Hello");
		a.print(5);
	}

}
