package code;

public class Solution46 {
    public int removeDuplicates(int[] nums) {
        int insertionPointer = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[insertionPointer++] = nums[i];
            }
        }
        return insertionPointer;
    }
}
