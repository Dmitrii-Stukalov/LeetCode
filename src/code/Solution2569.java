package code;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Solution2569 {
	public long[] handleQuery(int[] nums1, int[] nums2, int[][] queries) {
		List<Long> list = new ArrayList<>();
		int n = nums1.length;
		BitSet bs = new BitSet(n);
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += nums2[i];
			if (nums1[i] == 1) {
				bs.set(i);
			}
		}
		for (int[] query : queries) {
			if (query[0] == 1) {
				bs.flip(query[1], query[2] + 1);
			} else if (query[0] == 2) {
				sum += (long) query[1] * bs.cardinality();
			} else {
				list.add(sum);
			}
		}
		long[] ans = new long[list.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}
}
