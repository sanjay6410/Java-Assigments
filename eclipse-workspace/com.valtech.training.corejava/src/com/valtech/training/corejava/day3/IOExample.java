package com.valtech.training.corejava.day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

public class IOExample {
	
	public void writeChrToFile(String fileName,String data) throws IOException
	{
		File file =new File(fileName);
		Writer out=new FileWriter(file);
		out.write(data);
		out.close();
		
		
	}
	public String readFromChrFile(String filename) throws IOException
	{
		char[] buffer=new char[4];
		File file=new File(filename);
		Reader in=new BufferedReader(new FileReader(file));
		int i=-1;
		StringBuffer sb=new StringBuffer();
		while((i=in.read())!=-1)
		{
			System.out.println("Size of Read = " + i);
			//sb.append(new String(buffer,0,i));
		}
		in.close();
		return sb.toString();	
	}
	
	public String readFromFile(String filename) throws IOException
	{
		byte[] buffer=new byte[4]; //16k or 32k buffer size is ideal
		File file= new File(filename);
		InputStream is=new FileInputStream(file);
		int i=-1;
		StringBuffer sb=new StringBuffer(); 
		while((i=is.read(buffer))!=-1)
		{
			System.out.println("Size of Read = " + i);
			sb.append(new String(buffer,0,i));
		}
		is.close();
		return sb.toString();
	}
	
	public void writeToFile(String fileName,String contents) throws Exception
	{
		byte[] data=contents.getBytes();
		File file=new File(fileName);
		OutputStream os=new FileOutputStream(file);
		os.write(data);
		os.close(); //Always write in finally..
	}

	public static void main(String[] args) throws Exception {
        IOExample ex=new IOExample();
        ex.writeToFile("hello.txt","Hello World");
        //System.out.println(ex.readFromFile("hello.txt"));
        ex.writeChrToFile("helloo.txt", "How are you");
        System.out.println(ex.readFromChrFile("helloo.txt"));
	}

}
