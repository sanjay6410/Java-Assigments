package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PasswordcheckerTest {
	
	
	@Test
	public void testcheckLower() {
		 Passwordchecker lwr = new Passwordchecker();
		 assertEquals(false, lwr.checkSmaller("abcdef"));
	}
	
	
	@Test
	public void testcheckUpper() {
		Passwordchecker upr = new Passwordchecker();
		 assertEquals(true, upr.checkCapital("ABCDEFGHIJKLMN"));
	}
	
	
	@Test
	public void testcheckDigit() {
		Passwordchecker dig = new Passwordchecker();
		 assertEquals(true, dig.checkCapital("1,2,3,4,5,6,7,8,9"));
	}
	
	
	@Test
	public void testcheckSpclChar() {
		 Passwordchecker splch = new Passwordchecker();
		 assertEquals(19, splch.checkSpecialChars("!@#$%^&*"));
	}

	@Test
	public void testPasswordStrength() {
		String a="Vh#125aa";
		Passwordchecker p=new Passwordchecker();
		
		assertEquals("Moderate", p.checkPasswordStrength(a));
		assertEquals(22,p.total);
	}
	
}


