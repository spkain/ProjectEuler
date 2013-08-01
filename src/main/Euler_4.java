package main;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * NO.4
 *���E�ǂ��炩��ǂ�ł������l�ɂȂ鐔���񕶐��Ƃ����B 
 *2���̐��̐ςŕ\�����񕶐��̂����A�ő�̂��̂� 9009 = 91 �~ 99 �ł���B
 *�ł́A3���̐��̐ςŕ\�����񕶐��̂����ő�̂��̂͂�����ɂȂ邩�B
 *
 * ���񕶐����āH
 * �񕶐��i�����Ԃ񂷂��j�Ƃ́A14641�̂悤�ɋt���琔����ǂ�ł��������ɂȂ鐔�ł���B
 *�t����ǂ�ł������ɂȂ�񕶂��疼�t����ꂽ�B
 * (wikipedia����)
 * 
 * 3���ŉ񕶁i��j
 * 101,111,...,202,222...
 * ����������ł݂�...
 * 
 * �E�P���ځA �R���� �����Ȃ�����[0-9]
 *�@�E�i����ɕʂ̖@�����H�j
 * �̂悤���E�E�E
 * (�ŏ�)10000  [100*100]
 * (�ő�)998001�@[999*999]
 * 
 * ���Ƃ͕ʂ̊ϓ_
 * �T�P�^�ł́H
 * �E�P���ځA�T���ڂ���������[0-9]
 */
public class Euler_4 {

	/**
	 * �����n���Ă��������ɂ��(����*����)�̐ς̒l�̍ő�l��ԋp����
	 * @param �󂯓n��������(2,3) ����ȊO�͖ⓚ���p�ɂO��ԋp
	 * @return �񕶐��̍ő�l
	 */
	public static int getPalindrome(int argKeta){

		// �����m�F(2,3�ȊO�̓��͔͂F�߂Ȃ�)
		if ((argKeta != 2) && (argKeta != 3)) {
			System.err.println("2,3�ȊO�͔F�߂܂���E�E�E");
			return 0; // �ⓚ���p�̎d�l�ł�(�د)
		}
		
		// �\�[�g�p���X�g(�w�肳�ꂽ�����ɂ��񕶃��X�g���擾����)
		ArrayList<Integer> sortTmpList = getPalindromeList(argKeta);
		
		// �ԋp�p���X�g�̏�����
		int resultPalindromeList[] = new int[sortTmpList.size()];
		for(int i = 0; i < sortTmpList.size(); i++){
			resultPalindromeList[i] = (Integer)(sortTmpList.get(i));
		}
		
		// �\�[�g(�Ƃ肠�������X�g�����񂲂�����[�l���΂�΂�]
		// �ɂȂ��Ă���̂Ń\�[�g��������ł��G�G)
		Arrays.sort(resultPalindromeList); // �W���̃N�C�b�N�\�[�g(quicksort)�g�p
	
		// ���ʖ߂��p�ϐ�
		int result = resultPalindromeList[resultPalindromeList.length-1];
		return result;
	}

	/**
	 * �w�肳�ꂽ�����ɂ��񕶃��X�g���擾����
	 * [�����n���Ă��������ɂ��(����*����)�̐ς̃��X�g]
	 * 
	 * �e�X�g�͂��߂�Ȃ������Ƃŏ����܂�����G�G
	 * @param �Z�o�p����
	 * @return �񕶃��X�g
	 */
	private static ArrayList<Integer> getPalindromeList(int argKeta) {
		
		ArrayList<Integer> resultList = new ArrayList<Integer>();

		// �v�Z�p10�w���擾(etc 2��=>10-99, 3��=>100->999)
		int exponent=1;
		for(int i = 1; i<argKeta; i++){
			exponent = exponent * 10;
		}
		
		boolean palEqualTmpFlg = false; // �񕶈�v�m�F�p�ꎞ�t���O
		// �ς̎Z�o�Ɓ@�񕶐��擾
		for (int loopCount_i = exponent; loopCount_i < (exponent * 10); loopCount_i++) {
			for (int loopCount_j = exponent; loopCount_j < (exponent * 10); loopCount_j++) {
				
				// ������ϊ��p
				String palTmpStr = String.valueOf(loopCount_i * loopCount_j);
				
				int kaibunKeta = palTmpStr.length();
				// �񕶂��`�F�b�N����@�����ikaibunCheckCount-1�񕪂��m�F�j
				int kaibunCheckCount = kaibunKeta / 2;

				// �񕶊m�F��(kaibunCheckCount)���Ƃɉ񕶂��ǂ������m�F
				for(int loopCount_k = 0; loopCount_k < kaibunCheckCount; loopCount_k++){
					
					// �񕶐��̏���(���ꂼ��O���k���ڂ��r���Ĉ�v���Ă��邱��)
					String startSubstrChar = palTmpStr.substring(0+loopCount_k, 0+loopCount_k + 1); // �m�F�p�񕶂̊J�n�ʒu(etc: 1nnnn, n1nnn) 
					String endSubstChar = palTmpStr.substring(kaibunKeta-loopCount_k - 1, kaibunKeta-loopCount_k); // �m�F�p�񕶂̊J�n�ʒu(etc: nnnn1, nnn1n)
					
					// �񕶊m�F
					boolean palEqualCheck = startSubstrChar.equals(endSubstChar);
					if (palEqualCheck) {
						palEqualTmpFlg = true;
					}else{
						// ��ł���v���Ȃ��ꍇ
						palEqualTmpFlg = false;
						break;
					}
				}
				
				// �񕶊m�F�̌���(true�̂Ƃ��́A�e���|�����p�̃��X�g�ɒǉ�)
				if(palEqualTmpFlg){
					resultList.add(loopCount_i * loopCount_j);
				}
			}
		}
		return resultList;
	}
	
	// ���s�R�[�h
	public static void main(String[] args){
		//System.out.println(getPalindrome(2));
		System.out.println(getPalindrome(3));
	}
}
