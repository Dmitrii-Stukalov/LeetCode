package code;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution907 {
    public int sumSubarrayMins(int[] arr) {
        int mod = 1_000_000_000 + 7;
        int n = arr.length;
        long sum = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == arr.length || arr[stack.peek()] > arr[i])) {
                int mid = stack.pop();
                long L = mid - (stack.isEmpty() ? -1 : stack.peek());
                long R = i - mid;
                sum += arr[mid] * L * R;
                sum %= mod;
            }
            stack.push(i);
        }
        return (int) sum;
    }
}
