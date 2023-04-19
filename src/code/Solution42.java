package code;

public class Solution42 {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int leftMax = height[l];
        int rightMax = height[r];
        int ans = 0;
        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] < leftMax) {
                    ans += leftMax - height[l];
                } else {
                    leftMax = height[l];
                }
                l++;
            } else {
                if (height[r] < rightMax) {
                    ans += rightMax - height[r];
                } else {
                    rightMax = height[r];
                }
                r--;
            }
        }
        return ans;
    }
}
