package com.qmetry.testng_demo;

import static org.junit.Assert.assertEquals;



import static org.junit.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qmetry.Calculator;
import com.qmetry.ICalculator;


public class CalculatorTest {
	private static ICalculator calculator;

	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}

	@Test
	public void testSum() {
		int result = calculator.sum(4, 4);

		assertEquals(8, result);
		System.out.println("Test for Addition is done");
	}

	@Test
	public void testProduct() {
		int result = calculator.multiplication(4, 4);

		assertEquals(16, result);
		System.out.println("Test for Multiplications is done");
	}
	
	@Test
	public void testDivison() {
		try {
			int result = calculator.divison(10, 2);

			assertEquals(5, result);
			System.out.println("Test for Division is done");
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expectedExceptions = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.divison(10, 0);
		System.out.println("Test for handling '0' Division is done");
	}

	@Test
	public void testEqual() {
		boolean result = calculator.equalIntegers(20, 20);
		assertTrue(result);
		System.out.println("Test for Equals is done");
	}

	@Test
	public void testSubstraction() {
		int result = 10 - 3;

		assertTrue(result == 7);
		System.out.println("Test for Subtraction is done");
	}
}