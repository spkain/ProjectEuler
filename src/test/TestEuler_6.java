package test;

import junit.framework.TestCase;
import main.Euler_6;

public class TestEuler_6 extends TestCase {

	public void test1いれたら1戻るじゃないですか() {
		assertEquals(1, Euler_6.powerof(1));
	}

	public void test3いれたら9戻るじゃないですか() {
		assertEquals(9, Euler_6.powerof(3));
	}

	public void test1から3までの二乗の数値を足し合わせると14が戻る() {
		assertEquals(14, Euler_6.addSum(3));
	}

	public void test1から5までの二乗の数値を足し合わせると55が戻る() {
		assertEquals(55, Euler_6.addSum(5));
	}

	public void test1から10までの二乗の数値を足し合わせると385が戻る() {
		assertEquals(385, Euler_6.addSum(10));
	}

	public void test1から10までの数値を足し合わせて二乗すると3025になる() {
		assertEquals(3025, Euler_6.addSumPowerOf(10));
	}
	
	public void test1から10までの足し合わせた後の二乗の和から二乗の和を引くと2640() {
		assertEquals(2640, Euler_6.powerOfsMinusSumPowerOfs(10));
	}

}
