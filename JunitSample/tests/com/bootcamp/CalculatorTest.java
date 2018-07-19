package com.bootcamp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
	
	Calculator calc;

	@Before
	public void setUp() throws Exception {
		
		calc = new Calculator();
		
	}

	@After
	public void tearDown() throws Exception {
		
		calc = null; 
	}

	@Test
	public void testAdd() {
		
		double expectedResult = 20;
		double result = calc.add(10, 10);
		assertEquals(expectedResult, result);
		
	}

	@Test
	public void testSubtract() {
		
		double expectedResult = 20;
		double result = calc.subtract(30, 10);
		assertEquals(expectedResult, result);
	}

	@Test
	public void testMultiply() {
		
		double expectedResult = 100;
		double result = calc.multiply(10, 10);
		assertEquals(expectedResult, result);
	}

	@Test
	public void testDivide() {
		
		double expectedResult = 2;
		double result = calc.divide(20, 10);
		assertEquals("This is what is expected",expectedResult, result);
	}
	
	@Ignore
	public void testIsEven() {
		
		boolean result = calc.isEven(2);
		assertTrue(result);
	}

}
