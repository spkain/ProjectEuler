package main;

import java.util.List;

/**
 * NO.7
 *素数を小さい方から6つ並べると2, 3, 5, 7, 11, 13であり, 6番目の素数は13である。
 *10001番目の素数を求めよ
 *
 */
public class Euler_7 {

	public static void main(String[] args) {
		System.out.println(Euler_7.primeNo(10000));
	}
	
	public static int primeNo(int i) {
		List<Integer> list;
		int searchvalue = 3;
		do {
			list = Erato.getPrimeList(searchvalue);
			searchvalue += 50000;
		} while(list.size() <= i);
		return list.get(i);
	}

}
