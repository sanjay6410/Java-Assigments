package com.valtech.training.corejava.day3;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Rot13Reader extends Reader {
	
	//private Object source;
	private Reader sourse;
	

	public  Rot13Reader(Reader sourse) {
		this.sourse=sourse;
    }
	
	

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		char[] buffer=new char[cbuf.length];
		int i=sourse.read(buffer);
		if(i ==-1) return -1;
		for (int j = 0; j < i; j++) {
		      cbuf[j] = Rot13Utility.rotate(buffer[j]);
		}
		return i;
	}
	@Override
	public void close() throws IOException {
	   sourse.close();
	   
		
		
	}


}
