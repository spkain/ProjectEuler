package test;

import junit.framework.TestCase;
import main.Euler_9;

public class TestEuler_9 extends TestCase {
	
	public void test1と2をわたしたら5が帰ってくる() {
		assertEquals(5, Euler_9._step1(1, 2));
	}
	
	public void test3と4をわたしたら25が帰ってくる() {
		assertEquals(25, Euler_9._step1(3, 4));
	}
	
	public void testsqrtで小数点なし5() {
		assertEquals(5.0, Euler_9._sqrt(25));
	}
	
	public void testsqrtで小数点ありの場合() {
		assertEquals(1.4142135623730951, Euler_9._sqrt(2));
		assertEquals(18, ("" + Euler_9._sqrt(2)).length());
		//System.out.println(Math.sqrt(2));
		assertEquals(1.7320508075688772, Euler_9._sqrt(3));
		assertEquals(18, ("" + Euler_9._sqrt(3)).length());
		//System.out.println(Math.sqrt(3));
	}
	
	public void test平方根を求めたとき正の数ではないことを確認() {
		assertFalse(Euler_9._isNotNaturalNumber("2"));
		assertFalse(Euler_9._isNotNaturalNumber("3"));
		assertFalse(Euler_9._isNotNaturalNumber("5"));
		assertTrue(Euler_9._isNotNaturalNumber("1.4142135623730951"));
		assertTrue(Euler_9._isNotNaturalNumber("1.7320508075688772"));
	}
	
	//　TODO: 全ての思考結果で、a+b+c=1000と鳴る数値を求めるか
	// もしくは、段階ごとにピタゴラス数(Object)を返すか
	
	public void testMathpow倍がえしだ() {
		// 少なくとも下の算出結果よりは上にいくことはないはず
		//System.out.println(997*997);
	}
	
	public void testMathSqrtってなんだっけ() {
		assertEquals(500.0, Math.sqrt(250000.0));
	}
	
	public void test小数点から文字列に直したとき() {
		assertEquals("1.0", new Double(1.0).toString());
		assertEquals("1.25", new Double(1.25).toString());
		assertEquals("0.1", new Double(0.10).toString());
		assertEquals("0.1", new Double(0.10000000).toString());
	}

	public void test小数点が含まれているか() {
		assertTrue("1.1".indexOf(".") == 1);
		assertFalse("3".indexOf(".") == 1);
		assertTrue("3".indexOf(".") == -1);
	}
//	public void test文字列の特定の桁数目の数字を確認() {
//		assertEquals("1", "3.1".substring(2,3));
//	}
}
