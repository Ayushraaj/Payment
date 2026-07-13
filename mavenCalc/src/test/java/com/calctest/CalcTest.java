package com.calctest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.calc.Calculator;

public class CalcTest {
	
	Calculator c = new Calculator();
	
	@Test
	public void Testadd() {
		assertEquals(5, c.add(2, 3));
		
	}
	
	@Test
	public void TestSubtract() {
		assertEquals(-1, c.subtract(2, 3));
	}
	
	
	@Test
	public void TestMultiply() {
		assertEquals(6, c.multiply(2, 3));
	}
	
	@Test
	public void TestDivide() {
		assertEquals(1, c.divide(3, 2));
		
	}
	
	@Test
	public void TestDivideByZero() {
		assertThrows(ArithmeticException.class, ()-> c.divide(2,0));
	}

}
