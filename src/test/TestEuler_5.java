package test;

import junit.framework.TestCase;
import main.Euler_5;

public class TestEuler_5 extends TestCase {

	public void test1は1までの数字で割り切れる() {
		assertEquals(1, Euler_5.smallestMultiple(1));
	}

	public void test2は1から2までの数字で割り切れる() {
		assertEquals(2, Euler_5.smallestMultiple(2));
	}

	public void test12は1から4までの数字で割り切れる() {
		assertEquals(12, Euler_5.smallestMultiple(4));
	}

	public void test2520は1から10までの数字で割り切れる() {
		assertEquals(2520, Euler_5.smallestMultiple(10));
	}
}
