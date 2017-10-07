package junitdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test_addition_in_calculator_class() {

		Calculator calculator = new Calculator();
		
		int add_2_3 = calculator.add(2, 3);
		assertEquals("Calculator should properly add two numbers",add_2_3, 5);
		
		int add_3_4 = calculator.add(3, 4);
		assertEquals("Calculator should properly add two numbers",add_3_4, 7);
		
		int sub_3_1 = calculator.sub(3, 1);
		assertEquals("Calculator should properly substract two numbers",sub_3_1, 2);
		
		int sub_9_3 = calculator.sub(9, 3);
		assertEquals("Calculator should properly substract two numbers",sub_9_3, 6);
		
		int mul_2_3 = calculator.mul(2, 3);
		assertEquals("Calculator should properly multiply two numbers",mul_2_3, 6);
		
		int mul_3_4 = calculator.mul(3, 4);
		assertEquals("Calculator should properly multiply two numbers",mul_3_4, 12);
		
		int div_9_3 = calculator.div(9, 3);
		assertEquals("Calculator should properly divide two numbers",div_9_3, 3);
		
		int div_8_4 = calculator.div(8, 4);
		assertEquals("Calculator should properly divide two numbers",div_8_4, 2);
		
		int max_8_4 = calculator.max(8, 4);
		assertEquals("Calculator should properly choose greater from two numbers",max_8_4, 8);
		
		int max_4_8 = calculator.max(4, 8);
		assertEquals("Calculator should properly choose greater from two numbers",max_4_8, 8);
	}

}