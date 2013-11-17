package test;

import junit.framework.TestCase;
import main.Euler_6;
import main.Euler_7;

public class TestEuler_7 extends TestCase {

	public void test1番目だったら2がかえったらいいな() {
		assertEquals(2, Euler_7.primeNo(0));
	}

	public void test2番目だったら3がかえったらいいな() {
		assertEquals(3, Euler_7.primeNo(1));
	}
	
	public void test6番目の素数が13であること() {
		assertEquals(13, Euler_7.primeNo(5));
	}
}
