package debug;

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
		
		if (arg < 0){
			return false;
		}
		
		if (arg <= 0){
			return false;
		}
		
		// 1�͑f��
		if (arg == 1){
			return true;
		}

		for(long i = 3; i <= Math.sqrt(arg); i=i+2){
			
			// �r���Ŋ���؂�邩�ǂ���
			if((arg % i == 0) && (i != arg)){
				return false;
			}
		}
		
		// �f��
		return true;
	}
	
	public static boolean isPrime2(long arg){
		double max = Math.sqrt(arg);
		
		if(arg <= 3) return true;
		
		for(long i = 3; i < max; i=i+2){
			if ((arg % i) == 0) return false;
		}
		
		// �f��
		return true;
	}
	
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
		for (int i = 3; i <= Math.sqrt(arg); i=i+2){
			if(arg % i == 0){
				primeList.add((long)i);
			}
		}

		return primeList;
	}
	
	public static void main(String[] args){

		long start, end;
		start = System.currentTimeMillis();
		
		long max = 600851475143L;

		ArrayList<Long> primeList = getPrimeList2(600851475143L);
		long result = (long)primeList.get(primeList.size()-1);
		System.out.println(primeList);
		System.out.println("600851475143�́H" + result);
		
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
	}
}
