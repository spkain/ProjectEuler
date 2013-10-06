package main;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * NO.2
 * フィボナッチ数列の項は前の2つの項の和である。
 * 最初の2項を 1, 2 とすれば、
 * 最初の10項は以下の通りである。
 * 数列の項の値が400万を超えない範囲で、
 * 偶数値の項の総和を求めよ。
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 */
public class Euler_2 {
	
	public static ArrayList<Integer> getFivonattiList(int arg){
		ArrayList<Integer> fivonattilist = new ArrayList<Integer>();
		
		if(arg == 0){
			return null;
		}

		for(int i = 1; i <= arg; i++){
			if((i == 1) || (i == 2)){
				fivonattilist.add(i);
				System.out.println("[" + i + "] " + i);
			}else{
				fivonattilist.add((int) fivonattilist
						.get(fivonattilist.size() - 2)
						+ (int) fivonattilist.get(fivonattilist.size() - 1));
				System.out.println("[" + i + "] " + fivonattilist.get(fivonattilist.size() -1));
				if(fivonattilist.get(fivonattilist.size()-1) > 4000000){
					System.out.println(i + "ですよ");
					fivonattilist.remove(fivonattilist.size() - 1);
					return fivonattilist;
				}
			}
		}
		
		return fivonattilist;
	}
	public static void main(String[] args){
//		// 最大値いくつなんですか
//		System.out.println(Integer.MAX_VALUE);
		
		int sum = 0;
	
		ArrayList<Integer> fivonattilist = getFivonattiList(33);
		Iterator<Integer> it = fivonattilist.iterator();
		int i = 0;
		while(it.hasNext()){
			i = it.next();
			if(i % 2== 0){
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
