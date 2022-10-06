package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void test() {
		 TreeSet<Customer> set = new TreeSet<Customer>();
		 int Diamond=1,Platinum=2,Gold=3,Silver=4;

		 Customer a1 = new Customer("First",Platinum,"22-2-1988",28000);
		 Customer a2 = new Customer("Second", Diamond, "12-4-2001",57600);
		 Customer a3 = new Customer("Third", Silver, "18-11-2018",20980);
		 Customer a4 = new Customer("Fourth",Gold, "29-5-2021",18090);
		 Customer a5 = new Customer("Fifth",Platinum,"16-7-2010",98800);
		 Customer a6 = new Customer("Sixth", Silver, "16-3-2000",98700);
		 Customer a7 = new Customer("Seventh", Platinum, "27-8-2017",10980);
		 Customer a8 = new Customer("Eighth",Silver, "21-3-2022",12276);
		 Customer a9 = new Customer("Nineth", Gold, "24-3-2020",16578);
		 Customer a10 = new Customer("Tenth", Diamond, "25-5-2020",27681);
	  
	        set.add(a1);
	        set.add(a2);
	        set.add(a3);
	        set.add(a4);
	        set.add(a5);
	        set.add(a6);
	        set.add(a7);
	        set.add(a8);
	        set.add(a9);
	        set.add(a10);
		
    
    System.out.println("Order List");
    int count=0;
    for (Customer s : set) {
        System.out.println(convert(s.type) + " " + s.name + " "+ s.joinDate+  " "+s.value);
        count++;
    }
    
   
    assertEquals(count, set.size());
    
	}
	 public String convert(int a) {
		 
		 switch(a) {
		 case 1:
			 return "Dimond";
		 case 2:
			 return "Platinum";
		 case 3:
			 return "Gold";
		 case 4:
			 return "Silver";
		 }
		 return "null";
	    	
	    }
	}


