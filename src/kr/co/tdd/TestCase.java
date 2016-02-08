package kr.co.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {
	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		// Dollar와 Dollar를 비교하도록 함. product 변수 삭제 및 인라인화.
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}
	@Test
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
}
