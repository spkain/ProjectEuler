package test;

import java.util.ArrayList;

import main.Euler_2;
import junit.framework.TestCase;

public class TestEuler_2 extends TestCase {

	public void testGetFivonatti_null(){
		assertNull(Euler_2.getFivonattiList(0));
	}

	public void testGetFivonatti_First(){
		ArrayList<Integer> fivonatti = Euler_2.getFivonattiList(1);
		
		assertEquals(1, fivonatti.size());
		assertEquals(1, (int)fivonatti.get(0));
	}
	
	public void testGetFivonatti_Second(){
		ArrayList<Integer> fivonatti = Euler_2.getFivonattiList(2);
		
		assertEquals(2, fivonatti.size());
		assertEquals(2, (int)fivonatti.get(1));
	}

	public void testGetFivonatti_Third(){
		ArrayList<Integer> fivonatti = Euler_2.getFivonattiList(3);
		
		assertEquals(3, fivonatti.size());
		assertEquals(3, (int)fivonatti.get(2));
	}

	public void testGetFivonatti_Four(){
		ArrayList<Integer> fivonatti = Euler_2.getFivonattiList(4);
		
		assertEquals(4, fivonatti.size());
		assertEquals(5, (int)fivonatti.get(3));
	}

	public void testGetFivonatti_Ten(){
		ArrayList<Integer> fivonatti = Euler_2.getFivonattiList(10);
		
		assertEquals(10, fivonatti.size());
		assertEquals(89, (int)fivonatti.get(fivonatti.size()-1));
	}

}
