package main;

import java.util.ArrayList;

/**
 * NO.3
 *13195 �̑f������ 5�A7�A13�A29 �ł���B
 *600851475143 �̑f�����̂����ő�̂��̂����߂�B 
 *
 * ���f�������āH
 * �f�����i�����񂷂��A�p: prime factor�j�́A���R���̓��A���鎩�R���̖񐔂ɂȂ�f���ł���
 * (wikipedia����)
 * 
 * ���f�����āH
 * �f���i�������A�p: prime number�j�Ƃ́A1�Ƃ��̐����g�ȊO�ɐ��̖񐔂��Ȃ��A
 * 1 ���傫�Ȏ��R���̂���
 * (wikipedia����)
 * 
 */
public class Euler_3 {

	/**
	 * �f������p���\�b�h
	 * �߂�ǂ�����long�̍ő咷�܂ł������Ȃ���
	 * @param ���l
	 * @return �f���ł����true�A�����łȂ��ꍇ��false
	 */
	public static boolean isPrime(long arg){
		
		// 0�ȉ��͂��łɑf���ł͂Ȃ�
		if (arg <= 0){
			return false;
		}
		
		// 1�͑f��
		if (arg == 1){
			return true;
		}

		// �r���Ŋ���؂ꂽ��f���ł͂Ȃ�
		for(int i = 2; i <= arg; i++){
			// �r���Ŋ���؂�邩�ǂ���
			if((arg % i == 0) && (i != arg)){
				return false;
			}
		}
		
		// �f��
		return true;
	}
	
	/**
	 * �f�����������s����ꂽ�f�����̃��X�g��ԋp����
	 * @param ���l
	 * @return �f���������̃��X�g
	 */
	public static ArrayList<Long> getPrimeList(long arg){
		ArrayList<Long> primeList = new ArrayList<Long>();

		// �Q�̏ꍇ�͂��̂܂܂Q��ԋp
		if(arg == 2){
			primeList.add((long)2);
			
			return primeList;
		}
		
		// �n���ꂽ���l���Ђ�����f���Ŋ��葱���܂�
		for (int i = 2; i <= arg; i++){
			System.out.println(i);
			
			if(isPrime(i)){
				if(arg % i == 0){
					primeList.add((long)i);
				}
			}
			// ���̐����g��ǉ�����
			if(i == arg){
				primeList.add((long)i);
			}
		}
		
		return primeList;
	}
	
	/**
	 * �f�����������s����ꂽ�f�����̃��X�g��ԋp����
	 * @param ���l
	 * @return �f���������̃��X�g
	 */
	public static ArrayList<Long> getPrimeList2(long arg){
		ArrayList<Long> primeList = new ArrayList<Long>();
		
		// �Q�̏ꍇ�͂��̂܂܂Q��ԋp
		if(arg == 2){
			primeList.add((long)2);
			
			return primeList;
		}
		
		if(arg % 2 == 0){
			primeList.add((long)2);
			arg = arg / 2;
		}
		
		// �n���ꂽ���l���Ђ�����f���Ŋ��葱���܂�
		for (int i = 3; i <= arg; i=i+2){
				if(arg % i == 0){
					primeList.add((long)i);
					arg = arg / i;
					if(arg % 2 == 0){
						primeList.add((long)2);
						arg = arg / 2;
					}
					i = 3;
				}
		}

		return primeList;
	}
	
	public static void main(String[] args){
		ArrayList<Long> primeList = getPrimeList2(600851475143L);
		long result = (long)primeList.get(primeList.size()-1);
		System.out.println("600851475143�́H" + result);
	}
}
