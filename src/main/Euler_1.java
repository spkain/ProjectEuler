package main;
/**
 * No.1
 * 10�����̎��R���̂����A
 * 3 �������� 5 �̔{���ɂȂ��Ă�����̂� 
 * 3, 5, 6, 9 ��4������A
 *  �����̍��v�� 23 �ɂȂ�B
 *
 * �����悤�ɂ��āA1,000 ������ 3 �� 5 ��
 * �{���ɂȂ��Ă��鐔���̍��v�����߂�B
 *
 */
public class Euler_1 {
	
	/**
	 * �킽���ꂽ���l����3��������5�Ŋ���؂�鐔�̍��v��Ԃ�
	 * @param �킽���ꂽ���l
	 * @return 3��������5�̔{���̍��v�l
	 * �֐����͂Ă��Ɓ[
	 */
	public static int getSum(int arg){
		
		int sum = 0;
		
		for(int i = 1; i < arg; i++){
// 2��			
			// 3�܂���5�Ŋ���邩
			if((i % 3 == 0) || (i % 5 == 0)){
				sum = sum + i;
			}
// �P��			
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
