package com.valtech.training.corejava.day2;

//
// -/** is for documentation purpose
public class Outer 
{
	private int x=5;
	
	private class Inner
	{
		private void printX()
		{
			System.out.println("X = " + x);
		}
		private void increment()
		{
			x++;
		}
	}
	public Inner createInner()
	{
		return new Inner();
	}

	public static void main(String[] args) {
		Outer o=new Outer();
		Outer.Inner i=o.new Inner();
		Outer.Inner i1= o.createInner();
		i.printX();
		i1.printX();
		i.increment();
		//i1.increment();
		i1.printX();
		Outer.Inner i2=new Outer().createInner();
		i2.printX();
		}

}
