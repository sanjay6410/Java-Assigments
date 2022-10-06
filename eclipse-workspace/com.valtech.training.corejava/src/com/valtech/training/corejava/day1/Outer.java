package com.valtech.training.corejava.day1;

public class Outer 
{
	private static class Inner extends Outer
	{
		private void printHello()
		{
			System.out.println("Hello");
		}
	}
	private void printInner(Inner i)
	{
		i.printHello();
		
	}
	public static void main(String[] args) {
		Inner i=new Inner();
		i.printHello();
	    
		
	}
              
}
