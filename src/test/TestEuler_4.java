package test;

import main.Euler_4;
import junit.framework.TestCase;


public class TestEuler_4 extends TestCase {

	public void testgetPalindrome_2_3ˆÈŠO‚Í“ü—Í‚ğ‹‘â‚µ‚Ü‚·(){
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
		int ‰ñ•¶[] = new int[3];
		‰ñ•¶[0] = 12421;
		‰ñ•¶[1] = 981189;
		‰ñ•¶[2] = 111112;
		int start,end;
		start = 0;
		end = String.valueOf(‰ñ•¶[0]).length();
		int kai= 0;
		if(end % 2==0){
			kai = end / 2;
		}else{
			kai = (end / 2) - 1;
		}
		System.out.println(String.valueOf(‰ñ•¶[0]).substring(start,start+1));
		System.out.println(String.valueOf(‰ñ•¶[0]).substring(end-1,end));

		
		for(int i = 0; i< kai; i++){
			if (String.valueOf(‰ñ•¶[0]).substring(start+i, start+i + 1).equals(
					String.valueOf(‰ñ•¶[0]).substring(end-i - 1, end-i))) {
			}else{
			
				System.out.println("‰ñ•¶”ˆá‚¤");
			}
		}
	}
}
