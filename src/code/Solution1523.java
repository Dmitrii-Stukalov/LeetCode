package code;

public class Solution1523 {
	public int countOdds(int low, int high) {
		int count = high - low + 1;
		int half = count / 2;
		if (count % 2 == 0) {
			return half;
		}
		return low % 2 == 0 ? half : half + 1;
	}
}
