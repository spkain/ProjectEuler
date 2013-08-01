package main;

/**
 * NO.5
 *2520 は 1 から 10 の数字の全ての整数で割り切れる数字であり, そのような数字の中では最小の値である.
 *では, 1 から 20 までの整数全てで割り切れる数字の中で最小の正の数はいくらになるか.
 *
 *2520 は1,2,3,4,5,6,7,8,9,10の数字すべて割り切れる。（あまりなし）
 *???? は1,2,3,4,5・・・20までの数字すべて割り切れる。
 */
public class Euler_5 {

	public static void main(String[] args) {
		System.out.println(smallestMultiple(20));
	}

	public static int smallestMultiple(int to) {
		int i = 0;
		int result = 0;
		while(true) {
			i++;
			result = to * i;
			if (judge(result, to) == false) {
				continue;
			}
			break;
		}
		return result;
	}

	private static boolean judge(int result, int max) {
		for (int i = 1; i <= max; i++) {
			if (result % i != 0) {
				return false;
			}
		}
		return true;
	}
}
