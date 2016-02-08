package kr.co.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {
	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}
	@Test
	public void testEquality() {
		// 삼각측량을 이용하려면 예제가 두 개 이상 있어야 코드를 일반화할 수 있음. 
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		// $5 != $6
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
}
