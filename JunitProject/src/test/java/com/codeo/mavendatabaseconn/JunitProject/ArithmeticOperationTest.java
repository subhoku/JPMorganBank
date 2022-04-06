package com.codeo.mavendatabaseconn.JunitProject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ArithmeticOperationTest {
private ArithmeticOperation mathUtils;
	
	
	@BeforeEach
	void initEach() {
		mathUtils = new ArithmeticOperation();
		System.out.println(mathUtils.getC());
	}

	@Nested
	class AddTest {
		@Test
		void testAddingTwoPositives() {
			assertEquals(mathUtils.getC(), mathUtils.add(2, 1), 
					"Add method should return the sum of two numbers");
		}
		
		@Test
		
		void test() {
			System.out.println("This test ran");
		}
		
		@Test
		void testAddingTwoNegatives() {
			assertEquals(-2, mathUtils.add(-1, -1), 
					"Add method should return the sum of two numbers");
		}
		
		@Test
		void testAddingAPositiveAndANegative() {
			assertEquals(0, mathUtils.add(-1, 1), 
					"Add method should return the sum of two numbers");
		}
		/*
		 * @Test void examine() {
		 * assertEquals(4,mathUtils.examine(2),"Check Whether no is even"); }
		 */
	}
	
	
	@Test 
	void computeCircleArea() {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), 
				"Should return right circle area");
	}
	@Test 
	void calculateSimpleInterst() {
		assertEquals(2217.6, mathUtils.calculateSimpleInterst(9000,12.32,2), 
				"Should return Simple Interst");
	}
	
	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, 
				() -> mathUtils.divide(1, 0), 
				"Divide should throw ArithmeticException when denominator is zero");
	}
	 @Test
	    public void testEvenOddNumber(){
		 mathUtils = new ArithmeticOperation();
	        assertEquals("10 is a even number", true, mathUtils.isEvenNumber(5));
	    }
     
     
}
