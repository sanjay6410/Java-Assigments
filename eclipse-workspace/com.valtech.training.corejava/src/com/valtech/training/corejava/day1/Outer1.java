package com.valtech.training.corejava.day1;

public class Outer1 {
	private static class Inner
	{
		private int x=5;
	}
	private int y=5;
	void printX(Outer o)
	{
		System.out.println("X = " /*+ o.x*/);
	}
	public void increment(Outer o)
	{
		/*.x++*/;
	}
	public static void main(String[] args) {
		Outer o=new Outer();
		Inner i=new Inner();
		
	}

}
