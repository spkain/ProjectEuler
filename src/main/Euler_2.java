package main;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * NO.2
 * �t�B�{�i�b�`����̍��͑O��2�̍��̘a�ł���B
 * �ŏ���2���� 1, 2 �Ƃ���΁A
 * �ŏ���10���͈ȉ��̒ʂ�ł���B
 * ����̍��̒l��400���𒴂��Ȃ��͈͂ŁA
 * �����l�̍��̑��a�����߂�B
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
					System.out.println(i + "�ł���");
					fivonattilist.remove(fivonattilist.size() - 1);
					return fivonattilist;
				}
			}
		}
		
		return fivonattilist;
	}
	public static void main(String[] args){
//		// �ő�l�����Ȃ�ł���
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
