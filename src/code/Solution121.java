package code;

public class Solution121 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int least = prices[0];
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - least);
            least = Math.min(least, prices[i]);
        }
        return max;
    }
}
