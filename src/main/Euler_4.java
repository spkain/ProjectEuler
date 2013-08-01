package main;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * NO.4
 *左右どちらから読んでも同じ値になる数を回文数という。 
 *2桁の数の積で表される回文数のうち、最大のものは 9009 = 91 × 99 である。
 *では、3桁の数の積で表される回文数のうち最大のものはいくらになるか。
 *
 * ○回文数って？
 * 回文数（かいぶんすう）とは、14641のように逆から数字を読んでも同じ数になる数である。
 *逆から読んでも同じになる回文から名付けられた。
 * (wikipedia調べ)
 * 
 * 3桁で回文（例）
 * 101,111,...,202,222...
 * 特徴をつかんでみる...
 * 
 * ・１桁目、 ３桁目 がおなじ数字[0-9]
 *　・（さらに別の法則が？）
 * のようだ・・・
 * (最少)10000  [100*100]
 * (最大)998001　[999*999]
 * 
 * 問題とは別の観点
 * ５ケタでは？
 * ・１桁目、５桁目が同じ数字[0-9]
 */
public class Euler_4 {

	/**
	 * 引き渡してきた桁数により(桁数*桁数)の積の値の最大値を返却する
	 * @param 受け渡した桁数(2,3) それ以外は問答無用に０を返却
	 * @return 回文数の最大値
	 */
	public static int getPalindrome(int argKeta){

		// 引数確認(2,3以外の入力は認めない)
		if ((argKeta != 2) && (argKeta != 3)) {
			System.err.println("2,3以外は認めません・・・");
			return 0; // 問答無用の仕様です(ｷﾘｯ)
		}
		
		// ソート用リスト(指定された桁数により回文リストを取得する)
		ArrayList<Integer> sortTmpList = getPalindromeList(argKeta);
		
		// 返却用リストの初期化
		int resultPalindromeList[] = new int[sortTmpList.size()];
		for(int i = 0; i < sortTmpList.size(); i++){
			resultPalindromeList[i] = (Integer)(sortTmpList.get(i));
		}
		
		// ソート(とりあえずリストがすんごいこと[値がばらばら]
		// になっているのでソートしたいんです；；)
		Arrays.sort(resultPalindromeList); // 標準のクイックソート(quicksort)使用
	
		// 結果戻し用変数
		int result = resultPalindromeList[resultPalindromeList.length-1];
		return result;
	}

	/**
	 * 指定された桁数により回文リストを取得する
	 * [引き渡してきた桁数により(桁数*桁数)の積のリスト]
	 * 
	 * テストはごめんなさいあとで書きますから；；
	 * @param 算出用桁数
	 * @return 回文リスト
	 */
	private static ArrayList<Integer> getPalindromeList(int argKeta) {
		
		ArrayList<Integer> resultList = new ArrayList<Integer>();

		// 計算用10指数取得(etc 2桁=>10-99, 3桁=>100->999)
		int exponent=1;
		for(int i = 1; i<argKeta; i++){
			exponent = exponent * 10;
		}
		
		boolean palEqualTmpFlg = false; // 回文一致確認用一時フラグ
		// 積の算出と　回文数取得
		for (int loopCount_i = exponent; loopCount_i < (exponent * 10); loopCount_i++) {
			for (int loopCount_j = exponent; loopCount_j < (exponent * 10); loopCount_j++) {
				
				// 文字列変換用
				String palTmpStr = String.valueOf(loopCount_i * loopCount_j);
				
				int kaibunKeta = palTmpStr.length();
				// 回文をチェックする　桁数（kaibunCheckCount-1回分を確認）
				int kaibunCheckCount = kaibunKeta / 2;

				// 回文確認数(kaibunCheckCount)ごとに回文かどうかを確認
				for(int loopCount_k = 0; loopCount_k < kaibunCheckCount; loopCount_k++){
					
					// 回文数の条件(それぞれ前後のk桁目を比較して一致していること)
					String startSubstrChar = palTmpStr.substring(0+loopCount_k, 0+loopCount_k + 1); // 確認用回文の開始位置(etc: 1nnnn, n1nnn) 
					String endSubstChar = palTmpStr.substring(kaibunKeta-loopCount_k - 1, kaibunKeta-loopCount_k); // 確認用回文の開始位置(etc: nnnn1, nnn1n)
					
					// 回文確認
					boolean palEqualCheck = startSubstrChar.equals(endSubstChar);
					if (palEqualCheck) {
						palEqualTmpFlg = true;
					}else{
						// 一つでも一致しない場合
						palEqualTmpFlg = false;
						break;
					}
				}
				
				// 回文確認の結果(trueのときは、テンポラリ用のリストに追加)
				if(palEqualTmpFlg){
					resultList.add(loopCount_i * loopCount_j);
				}
			}
		}
		return resultList;
	}
	
	// 実行コード
	public static void main(String[] args){
		//System.out.println(getPalindrome(2));
		System.out.println(getPalindrome(3));
	}
}
