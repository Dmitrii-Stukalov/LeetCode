package code;

public class Solution1828 {
	public int[] countPoints(int[][] points, int[][] queries) {
		int[] ans = new int[queries.length];
		for (int i = 0; i < queries.length; i++) {
			int[] query = queries[i];
			for (int[] point : points) {
				double distance = Math.pow(point[0] - query[0], 2) + Math.pow(point[1] - query[1], 2);
				if (distance <= query[2] * query[2]) {
					ans[i]++;
				}
			}
		}
		return ans;
	}
}
