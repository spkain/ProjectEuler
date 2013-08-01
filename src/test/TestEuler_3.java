package test;

import java.util.ArrayList;

import main.Euler_3;

import junit.framework.TestCase;

public class TestEuler_3 extends TestCase {

	public void testGetPrimeList(){
		ArrayList<Long> primeList = Euler_3.getPrimeList2(2);
		assertEquals(1, primeList.size());
		assertEquals(2, (long)primeList.get(0));
	}
	
	public void testGetPrimeList_10(){
		ArrayList<Long> primeList = Euler_3.getPrimeList2(10);
		assertEquals(2, primeList.size());
	}
	
	// *13195 の素因数は 5、7、13、29 である。
	public void testGetPrimeList_13195(){
		ArrayList<Long> primeList = Euler_3.getPrimeList2(13195);
		System.out.println(primeList);
		assertEquals(4, (long)primeList.size());
		assertEquals(5, (long)primeList.get(0));
		assertEquals(7, (long)primeList.get(1));
		assertEquals(13, (long)primeList.get(2));
		assertEquals(29, (long)primeList.get(3));
	}

	//13195000
	//600851475143
	//70000
	public void testGetPrimeList_13195_1000(){
		
		for(int i = 0; i < 1000; i++){
			Euler_3.getPrimeList2(13195);
		}
	}

	public void testGetPrimeList_13195_1000_10000(){

		for(int j = 0; j < 10000; j++){
		for(int i = 0; i < 1000; i++){
			Euler_3.getPrimeList2(13195);
		}
		}
	}
}
