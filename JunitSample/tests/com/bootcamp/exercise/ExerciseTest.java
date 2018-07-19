package com.bootcamp.exercise;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class ExerciseTest {

	Exercise exc;
	
	@Before
	public void setUp() throws Exception {
		
		exc = new Exercise();
	}

	@After
	public void tearDown() throws Exception {
		
		exc = null;
	}

	@Test
	public void testNoTriples() {
		int [] arr = {1,1,2,2,2,2,1};
//		boolean expectedResult = true;
		boolean result = exc.noTriples(arr);
		assertTrue(result);
//		assertEquals(expectedResult, result);
	}

	@Test
	public void testRedTicket() {
		int expectedResult = 10;
		int result = exc.redTicket(2,2,2);
		assertEquals(expectedResult, result);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	
	public void testStringEx() {
		int expectedResult = 3;
		int result = exc.stringE("heellewssssss");
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testStringE() {
		int expectedResult = 4;
		int result = exc.stringE("heellew");
		assertEquals(expectedResult, result);
	}
}
