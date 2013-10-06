package main;
/**
 * No.1
 * 10未満の自然数のうち、
 * 3 もしくは 5 の倍数になっているものは 
 * 3, 5, 6, 9 の4つがあり、
 *  これらの合計は 23 になる。
 *
 * 同じようにして、1,000 未満の 3 か 5 の
 * 倍数になっている数字の合計を求めよ。
 *
 */
public class Euler_1 {
	
	/**
	 * わたされた数値内で3もしくは5で割り切れる数の合計を返す
	 * @param わたされた数値
	 * @return 3もしくは5の倍数の合計値
	 * 関数名はてけとー
	 */
	public static int getSum(int arg){
		
		int sum = 0;
		
		for(int i = 1; i < arg; i++){
// 2例			
			// 3または5で割れるか
			if((i % 3 == 0) || (i % 5 == 0)){
				sum = sum + i;
			}
// １例			
//			if(i % 3 == 0){
//				sum = sum + i;
//			}else if(i % 5 == 0){
//				sum = sum + i;
//			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		System.out.println(getSum(1000));
	}
	 
}
