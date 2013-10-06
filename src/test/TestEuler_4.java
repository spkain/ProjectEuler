package test;

import main.Euler_4;
import junit.framework.TestCase;


public class TestEuler_4 extends TestCase {

	public void testgetPalindrome_2_3以外は入力を拒絶します(){
		assertEquals(0, Euler_4.getPalindrome(1));
		assertEquals(0, Euler_4.getPalindrome(-1));
		assertEquals(0, Euler_4.getPalindrome(4));
	}
	
	public void testgetPalindrome(){
		assertEquals(9009, Euler_4.getPalindrome(2));
	}
	
	public void testgetPalindrome2(){
		assertEquals(906609, Euler_4.getPalindrome(3));
	}
	
	public void testspike(){
		 //12421
		 //981189
		int 回文[] = new int[3];
		回文[0] = 12421;
		回文[1] = 981189;
		回文[2] = 111112;
		int start,end;
		start = 0;
		end = String.valueOf(回文[0]).length();
		int kai= 0;
		if(end % 2==0){
			kai = end / 2;
		}else{
			kai = (end / 2) - 1;
		}
		System.out.println(String.valueOf(回文[0]).substring(start,start+1));
		System.out.println(String.valueOf(回文[0]).substring(end-1,end));

		
		for(int i = 0; i< kai; i++){
			if (String.valueOf(回文[0]).substring(start+i, start+i + 1).equals(
					String.valueOf(回文[0]).substring(end-i - 1, end-i))) {
			}else{
			
				System.out.println("回文数違う");
			}
		}
	}
}
