package test;

import junit.framework.TestCase;
import main.Euler_5;

public class TestEuler_5 extends TestCase {

	public void test1��1�܂ł̐����Ŋ���؂��() {
		assertEquals(1, Euler_5.smallestMultiple(1));
	}

	public void test2��1����2�܂ł̐����Ŋ���؂��() {
		assertEquals(2, Euler_5.smallestMultiple(2));
	}

	public void test12��1����4�܂ł̐����Ŋ���؂��() {
		assertEquals(12, Euler_5.smallestMultiple(4));
	}

	public void test2520��1����10�܂ł̐����Ŋ���؂��() {
		assertEquals(2520, Euler_5.smallestMultiple(10));
	}
}
