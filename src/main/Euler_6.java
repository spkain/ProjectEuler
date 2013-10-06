package main;

/**
 * NO.6
 *Å‰‚Ì10ŒÂ‚Ì©‘R”‚É‚Â‚¢‚Ä, ‚»‚Ì“ñæ‚Ì˜a‚Í,
 * 1^2 + 2^2 + ... + 10^2 = 385
 *Å‰‚Ì10ŒÂ‚Ì©‘R”‚É‚Â‚¢‚Ä, ‚»‚Ì˜a‚Ì“ñæ‚Í,
 * (1 + 2 + ... + 10)^2 = 3025
 */
public class Euler_6 {

	public static void main(String[] args) {
		System.out.println(Euler_6.powerOfsMinusSumPowerOfs(100));
	}

	public static int powerof(int num) {
		return num * num;
	}

	public static int addSum(int num) {
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum = sum + powerof(i);
		}

		return sum;
	}

	public static int addSumPowerOf(int num) {

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}

		return powerof(sum);
	}

	public static int powerOfsMinusSumPowerOfs(int num) {
		int sum = 0;
		sum = addSumPowerOf(num);
		sum = sum - addSum(num);
		return sum;
	}

}
