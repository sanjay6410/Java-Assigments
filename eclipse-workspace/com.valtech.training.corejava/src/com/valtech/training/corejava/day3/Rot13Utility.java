package com.valtech.training.corejava.day3;

import static org.junit.Assert.assertEquals;

public class Rot13Utility {


	public static char rotate(char c)
	{
		// TODO Auto-generated method stub
        if(c >= 'a' && c <= 'm') {
            return (char) (c+13);
        }
        else if((c>='A')&& (c<='M')) {
			return (char) (c+13);
		}
		else if(c>='n' && c<='z') {
			return(char) (c-13);
		}
		else if(c>='N' && c<='Z') {
			return(char) (c-13);
		}
		return (char) c;
	}
}