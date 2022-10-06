package com.valtech.training.corejava.day5;

import java.util.Comparator;

public class StringSort implements Comparator<String> {
	    
	   public int vowelCount(String s)
	   {
		   String n=s.toLowerCase();
		   char[] c=n.toCharArray();
		   int count=0;
		   for(int i=0;i<=c.length-1;i++)
		   {
			   if((c[i]=='a')||(c[i]=='i')||(c[i]=='e')||(c[i]=='o')||(c[i]=='u'))
			   {
				   count++;
			   }
		   }
		   return count;
	   }
	
	
        public int compare(String s1, String s2) {
        	int l1=s1.length();
        	int l2=s2.length();
        	int l3=vowelCount(s1);
        	int l4=vowelCount(s2);
            if(l1 < l2) {
                return -1;
            }
            if(l1>l2) {
                return 1;
            }
            if(l1==l2)
            {
            	if(l3<l4)
            	{
            		return  1;
            	}
            	if(l3>l4)
            	{
            		return -1;
            	}
            	if(l3==l4)
            	{
            		s1.compareTo(s2);
            	}
            }
            
			return 0; 
        }
}