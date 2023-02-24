package org.example;

import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest
{
	Calculator calcObj = new Calculator();

	// Tests for Square Root Function
	@Test
	public void testSquareRoot()
	{
		// Test 1
		assertEquals((Double) 4.0, calcObj.computeSquareRoot(16.0));

		// Test 2
		assertEquals((Double) 0.0, calcObj.computeSquareRoot(0.0));

		// Test 3
		assertEquals((Double) 9.55, calcObj.computeSquareRoot(91.2025));

		// Test 4
		assertEquals((Double) 1.0, calcObj.computeSquareRoot(1.0));

		// Test 5
		assertEquals((Double) 5.225, calcObj.computeSquareRoot(27.300625));
	}

	// Tests for Factorial Function
	@Test
	public void testFactorial()
	{
		// Test 1
		assertEquals((Integer) 1, calcObj.computeFactorial(0));

		// Test 2
		assertEquals((Integer) 1, calcObj.computeFactorial(1));
 
		// Test 3
		assertEquals((Integer) 2, calcObj.computeFactorial(2));

		// Test 4
		assertEquals((Integer) 120, calcObj.computeFactorial(5));

		// Test 5
		assertEquals((Integer) 3628800, calcObj.computeFactorial(10));
	}

	// Tests for Natural Log Function
	@Test
	public void testNaturalLog()
	{
		// Test 1
		assertEquals((Double) 0.0, calcObj.computeNaturalLog(1.0), 0.0);

		// Test 2
		assertEquals((Double) 2.302585, calcObj.computeNaturalLog(10.0), 0.000001);

		// Test 3
		assertEquals((Double) 0.693147, calcObj.computeNaturalLog(2.0), 0.000001);

		// Test 4
		assertEquals((Double) (-1.386294), calcObj.computeNaturalLog(0.25), 0.000001);

		// Test 5
		assertEquals((Double) (-6.907755), calcObj.computeNaturalLog(0.001), 0.000001);
	}

	// Tests for Power Function
	@Test
	public void testPower()
	{
		// Test 1
		assertEquals((Double) 9.0, calcObj.computePower(3.0, 2.0), 0.0);

		// Test 2
		assertEquals((Double) 1.0, calcObj.computePower(1.0, 100.0), 0.0);

		// Test 3
		assertEquals((Double) 1.0, calcObj.computePower(-3.0, 0.0), 0.0);

		// Test 4
		assertEquals((Double) 433.217393, calcObj.computePower(7.0, 3.12), 0.000001);

		// Test 5
		assertEquals((Double) (-64.0), calcObj.computePower(-4.0, 3.00), 0.000001);
	}

}
