package test;

import junit.framework.TestCase;
import main.Euler_6;

public class TestEuler_6 extends TestCase {

	public void test1���ꂽ��1�߂邶��Ȃ��ł���() {
		assertEquals(1, Euler_6.powerof(1));
	}

	public void test3���ꂽ��9�߂邶��Ȃ��ł���() {
		assertEquals(9, Euler_6.powerof(3));
	}

	public void test1����3�܂ł̓��̐��l�𑫂����킹���14���߂�() {
		assertEquals(14, Euler_6.addSum(3));
	}

	public void test1����5�܂ł̓��̐��l�𑫂����킹���55���߂�() {
		assertEquals(55, Euler_6.addSum(5));
	}

	public void test1����10�܂ł̓��̐��l�𑫂����킹���385���߂�() {
		assertEquals(385, Euler_6.addSum(10));
	}

	public void test1����10�܂ł̐��l�𑫂����킹�ē�悷���3025�ɂȂ�() {
		assertEquals(3025, Euler_6.addSumPowerOf(10));
	}
	
	public void test1����10�܂ł̑������킹����̓��̘a������̘a��������2640() {
		assertEquals(2640, Euler_6.powerOfsMinusSumPowerOfs(10));
	}

}
