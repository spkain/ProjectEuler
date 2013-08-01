package test;

import junit.framework.TestCase;
import main.Euler_5;

public class TestEuler_5 extends TestCase {

	public void test1‚Í1‚Ü‚Å‚Ì”š‚ÅŠ„‚èØ‚ê‚é() {
		assertEquals(1, Euler_5.smallestMultiple(1));
	}

	public void test2‚Í1‚©‚ç2‚Ü‚Å‚Ì”š‚ÅŠ„‚èØ‚ê‚é() {
		assertEquals(2, Euler_5.smallestMultiple(2));
	}

	public void test12‚Í1‚©‚ç4‚Ü‚Å‚Ì”š‚ÅŠ„‚èØ‚ê‚é() {
		assertEquals(12, Euler_5.smallestMultiple(4));
	}

	public void test2520‚Í1‚©‚ç10‚Ü‚Å‚Ì”š‚ÅŠ„‚èØ‚ê‚é() {
		assertEquals(2520, Euler_5.smallestMultiple(10));
	}
}
