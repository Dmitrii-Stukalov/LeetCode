package code;

public class Solution2566 {
	public int minMaxDifference(int num) {
		String tmp = Integer.toString(num);
		int n = tmp.length();
		int[] digits = new int[n];
		for (int i = 0; i < n; i++) {
			digits[i] = tmp.charAt(i) - '0';
		}
		int number = 0;
		for (int i = 0; i < n; i++) {
			if (digits[i] != 9) {
				number = digits[i];
				break;
			}
		}
		int[] maxDigits = new int[n];
		for (int i = 0; i < n; i++) {
			if (digits[i] == number) {
				maxDigits[i] = 9;
			} else {
				maxDigits[i] = digits[i];
			}
		}

		int[] minDigits = new int[n];
		number = digits[0];
		for (int i = 0; i < n; i++) {
			if (digits[i] == number) {
				minDigits[i] = 0;
			} else {
				minDigits[i] = digits[i];
			}
		}

//		System.out.println(Arrays.toString(digits));
//		System.out.println(Arrays.toString(maxDigits));
//		System.out.println(Arrays.toString(minDigits));
		StringBuilder sb = new StringBuilder();
		for (int maxDigit : maxDigits) {
			sb.append(maxDigit);
		}
		int max = Integer.parseInt(sb.toString());
		sb.setLength(0);
		for (int minDigit : minDigits) {
			sb.append(minDigit);
		}
		int min = Integer.parseInt(sb.toString());
		return max - min;
	}
}
