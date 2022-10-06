package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FactRT {

	@Test
	public static long factorial(long n)
	{
		long result=1;
		for(int i=1;i<=n;i++)
		{
			 result=result*i;
		}
		return result;
	}
	
	static List<Long>factorials=new ArrayList<>();
	
	@Test
	public static  long  factorial1(long n) throws Exception
	{
		factorials.add((long) 1);
		factorials.add((long) 2);
		factorials.add((long) 6);
		factorials.add((long) 24);
		factorials.add((long) 120);
		factorials.add((long) 720);
		factorials.add((long) 5040);
		factorials.add((long) 40320);
		factorials.add((long) 362880);
		factorials.add((long) 3628800);
		
		long size=factorials.size();
		long result=1;
		if(size >=n-1)
		{
			 return factorials.get((int) (n-1));
		}
	
		if(n > size)
		{
			for(int i=1;i<=n;i++)
			{
				 result=result*i;
			}
			return result;

		}
		/*
		long fact=factorial(n-1);
		long factn=n*fact;
		factorials.add(factn);
		*/
		return 0;
		
	}
	public static void main(String[] args) throws Exception {
		//System.out.println(factorial(11));
		System.out.println(factorial1(13));
	}
}
