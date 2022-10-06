package com.valtech.training.corejava.day2;

public class ExceptionT 
{
	public int div(int a,int b)throws Exception
	{
		if(b==100)throw new Exception("B is 100 Invalid value");
		return a/b;
		
	}
	public int calculateSimpleIntrest(int p,int r,int t)
	{
		try {
			return div(p*t*r,100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This Code is Always Executed.......");
		}
		return 0;
	}
	public static void main(String[] args) {
		ExceptionT t=new ExceptionT();
		int intrest = t.calculateSimpleIntrest(100,12,12);
		System.out.println(intrest);
		 
	}

}
