package test;

import main.Euler_1;
import junit.framework.TestCase;

/**
 * 
 * Euler_1�p�e�X�g�N���X
 */
public class TestEuler_1 extends TestCase {
	
	/**
	 * @link {@link Euler_1#getSum(int)}�̂��߂̃e�X�g���\�b�h�B
	 * 1�n������0���Ԃ���炵��
	 */
	public void testGetSum_1(){
		assertEquals(0, Euler_1.getSum(1));
	}
	
	/**
	 * @link {@link Euler_1#getSum(int)}�̂��߂̃e�X�g���\�b�h�B
	 * 10�n������23���Ԃ���炵��
	 */
	public void testGetSum_2(){
		assertEquals(23, Euler_1.getSum(10));
	}
	
}
