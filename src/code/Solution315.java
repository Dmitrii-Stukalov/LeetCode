package code;

import java.util.LinkedList;
import java.util.List;

public class Solution315 {
	public List<Integer> countSmaller(int[] nums) {
		if (nums == null || nums.length == 0) return new LinkedList<>();
		int n = nums.length;
		int[] result = new int[n];

		ArrayWithOriginalIndex[] newNums = new ArrayWithOriginalIndex[n];
		for (int i = 0; i < n; ++i) newNums[i] = new ArrayWithOriginalIndex(nums[i], i);

		mergeSortAndCount(newNums, 0, n - 1, result);

		List<Integer> resultList = new LinkedList<>();
		for (int i : result) {
			resultList.add(i);
		}

		return resultList;
	}

	private void mergeSortAndCount(ArrayWithOriginalIndex[] nums, int start, int end, int[] result) {
		if (start >= end) return;

		int mid = (start + end) / 2;
		mergeSortAndCount(nums, start, mid, result);
		mergeSortAndCount(nums, mid + 1, end, result);

		int leftPos = start;
		int rightPos = mid + 1;
		LinkedList<ArrayWithOriginalIndex> merged = new LinkedList<>();
		int numElemsRightArrayLessThanLeftArray = 0;
		while (leftPos < mid + 1 && rightPos <= end) {
			if (nums[leftPos].value > nums[rightPos].value) {
				++numElemsRightArrayLessThanLeftArray;
				merged.add(nums[rightPos]);
				++rightPos;
			} else {
				result[nums[leftPos].originalIndex] += numElemsRightArrayLessThanLeftArray;

				merged.add(nums[leftPos]);
				++leftPos;
			}
		}

		while (leftPos < mid + 1) {
			result[nums[leftPos].originalIndex] += numElemsRightArrayLessThanLeftArray;

			merged.add(nums[leftPos]);
			++leftPos;
		}
		while (rightPos <= end) {
			merged.add(nums[rightPos]);
			++rightPos;
		}

		int pos = start;
		for (ArrayWithOriginalIndex m : merged) {
			nums[pos] = m;
			++pos;
		}
	}

	private static class ArrayWithOriginalIndex {
		int value;
		int originalIndex;

		public ArrayWithOriginalIndex(int value, int originalIndex) {
			this.value = value;
			this.originalIndex = originalIndex;
		}
	}
}
