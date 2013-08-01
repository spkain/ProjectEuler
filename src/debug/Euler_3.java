package debug;

import java.util.ArrayList;

/**
 * NO.3
 *13195 の素因数は 5、7、13、29 である。
 *600851475143 の素因数のうち最大のものを求めよ。 
 *
 * ○素因数って？
 * 素因数（そいんすう、英: prime factor）は、自然数の内、ある自然数の約数になる素数である
 * (wikipedia調べ)
 * 
 * ○素数って？
 * 素数（そすう、英: prime number）とは、1とその数自身以外に正の約数がない、
 * 1 より大きな自然数のこと
 * (wikipedia調べ)
 * 
 */
public class Euler_3 {

	/**
	 * 素数判定用メソッド
	 * めんどいからlongの最大長までしかやらないよ
	 * @param 数値
	 * @return 素数であればtrue、そうでない場合はfalse
	 */
	public static boolean isPrime(long arg){
		
		if (arg < 0){
			return false;
		}
		
		if (arg <= 0){
			return false;
		}
		
		// 1は素数
		if (arg == 1){
			return true;
		}

		for(long i = 3; i <= Math.sqrt(arg); i=i+2){
			
			// 途中で割り切れるかどうか
			if((arg % i == 0) && (i != arg)){
				return false;
			}
		}
		
		// 素数
		return true;
	}
	
	public static boolean isPrime2(long arg){
		double max = Math.sqrt(arg);
		
		if(arg <= 3) return true;
		
		for(long i = 3; i < max; i=i+2){
			if ((arg % i) == 0) return false;
		}
		
		// 素数
		return true;
	}
	
	public static ArrayList<Long> getPrimeList2(long arg){
		ArrayList<Long> primeList = new ArrayList<Long>();
		
		// ２の場合はそのまま２を返却
		if(arg == 2){
			primeList.add((long)2);
			
			return primeList;
		}
		
		if(arg % 2 == 0){
			primeList.add((long)2);
			arg = arg / 2;
		}
		
		// 渡された数値をひたすら素数で割り続けます
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
	 * 素因数分解を行いわれた素因数のリストを返却する
	 * @param 数値
	 * @return 素因数分解のリスト
	 */
	public static ArrayList<Long> getPrimeList(long arg){
		ArrayList<Long> primeList = new ArrayList<Long>();
		
		// ２の場合はそのまま２を返却
		if(arg == 2){
			primeList.add((long)2);
			
			return primeList;
		}
		
		// 渡された数値をひたすら素数で割り続けます
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
		System.out.println("600851475143は？" + result);
		
		end = System.currentTimeMillis();
		System.out.println((end - start) + "ms");
		
	}
}
