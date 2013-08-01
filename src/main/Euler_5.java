package main;

/**
 * NO.5
 *2520 �� 1 ���� 10 �̐����̑S�Ă̐����Ŋ���؂�鐔���ł���, ���̂悤�Ȑ����̒��ł͍ŏ��̒l�ł���.
 *�ł�, 1 ���� 20 �܂ł̐����S�ĂŊ���؂�鐔���̒��ōŏ��̐��̐��͂�����ɂȂ邩.
 *
 *2520 ��1,2,3,4,5,6,7,8,9,10�̐������ׂĊ���؂��B�i���܂�Ȃ��j
 *???? ��1,2,3,4,5�E�E�E20�܂ł̐������ׂĊ���؂��B
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
