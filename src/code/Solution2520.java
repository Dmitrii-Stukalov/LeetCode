package code;

public class Solution2520 {
	public int countDigits(int num) {
		int numCopy = num;
		int ans = 0;
		while (numCopy > 0) {
			int digit = numCopy % 10;
			if (num % digit == 0) {
				ans++;
			}
			numCopy /= 10;
		}
		return ans;
	}
}
