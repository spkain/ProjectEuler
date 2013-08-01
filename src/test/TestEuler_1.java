package test;

import main.Euler_1;
import junit.framework.TestCase;

/**
 * 
 * Euler_1用テストクラス
 */
public class TestEuler_1 extends TestCase {
	
	/**
	 * @link {@link Euler_1#getSum(int)}のためのテストメソッド。
	 * 1渡されると0が返えるらしい
	 */
	public void testGetSum_1(){
		assertEquals(0, Euler_1.getSum(1));
	}
	
	/**
	 * @link {@link Euler_1#getSum(int)}のためのテストメソッド。
	 * 10渡されると23が返えるらしい
	 */
	public void testGetSum_2(){
		assertEquals(23, Euler_1.getSum(10));
	}
	
}
