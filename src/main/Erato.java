package main;

import java.util.ArrayList;
import java.util.List;

public class Erato {
	
	private static List<Integer> searchList = new ArrayList<Integer>();
	private static List<Integer> tempPrimeList = new ArrayList<Integer>();
	private static List<Integer> afterSearchList = new ArrayList<Integer>();
	private static List<Integer> primeList = new ArrayList<Integer>();
	private static int nowMax = 0;
	
	/**
	 * @deprecated use other method {@link #getPrimeList(int)}
	 * @param searchMax
	 * @return
	 */
	public static List<Integer> _step1(int searchMax) {
		searchList.clear();
		tempPrimeList.clear();
		afterSearchList.clear();
		primeList.clear();
		for (int i = 2; i <= searchMax; i++) {
			searchList.add(i);
		}
		return searchList;
	}

	/**
	 * @deprecated use other method {@link #getPrimeList(int)}
	 * @return
	 */
	public static List<Integer> _step2() {
		tempPrimeList.add(searchList.get(0));
		return tempPrimeList;
	}

	/**
	 * @deprecated use other method {@link #getPrimeList(int)}
	 * @return
	 */
	public static List<Integer> _step3() {
		
		afterSearchList.clear();
		for (int i = 0; i < tempPrimeList.size(); i++) {
			int b = tempPrimeList.get(i);
			
			for(int j = 0; j < searchList.size(); j++) {
				int a = searchList.get(j);
				if (b == a || (a % b == 0)) {
					if (afterSearchList.indexOf(a) == -1) {
						afterSearchList.add(a);
					}
				}
			}
		}

		for (int i = 0; i < afterSearchList.size(); i++) {
			searchList.remove(afterSearchList.get(i));
		}
		
		return searchList;
	}

	/**
	 * @deprecated use other method {@link #getPrimeList(int)}
	 * @return
	 */
	public static List<Integer> _step4() {

		int max = 0;
		int srchMax = 0;
		do {
			primeList.clear();
			_step2();
			_step3();
			primeList.addAll(tempPrimeList);
			
			max = tempPrimeList.get(tempPrimeList.size()-1);
			srchMax = searchList.get(searchList.size()-1);
			
		} while(srchMax > pow(max)) ;
		primeList.addAll(searchList);
		tempPrimeList.clear();
		afterSearchList.clear();
		return primeList;
	}

	private static int pow(int a) {
		return a * a;
	}

	private static void init(int max) {
		if (max < 1) {
			return;
		}
		nowMax = max;
		_step1(max);
		_step4();
	}
	
	/**
	 * get Prime-List
	 * @param searchMax
	 * @return
	 */
	public static List<Integer> getPrimeList(int searchMax) {

		if (primeList.isEmpty()) {
			init(searchMax);
		
		}else if (searchMax != nowMax) {
			init(searchMax);
		}

		return primeList;
	}

	/**
	 * has item in Prime-List
	 * @param searchMaxNum
	 * @param target
	 * @return
	 */
	public static boolean hasPrime(int searchMaxNum, int target) {
		if (target < 1 || searchMaxNum < target) {
			return false;
		}
		
		if (primeList.size() == 0) {
			init(searchMaxNum);
		}
		
		if (primeList.isEmpty()) {
			return false;
		}
		
		if (primeList.get(primeList.size()-1) < target) {
			return false;
		}
		
		if (primeList.indexOf(target) == -1) {
			return false;
		}
		
		return true;
	}
}
