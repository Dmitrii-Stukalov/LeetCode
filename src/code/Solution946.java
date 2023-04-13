package code;


import java.util.ArrayDeque;
import java.util.Deque;

public class Solution946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int i = 0;
        int j = 0;
        while (i < pushed.length || j < popped.length) {
            Integer peek = stack.peekLast();
            if (peek != null && peek == popped[j]) {
                stack.pollLast();
                j++;
            } else if (i < pushed.length) {
                stack.add(pushed[i++]);
            } else {
                break;
            }
        }
        return stack.isEmpty();
    }
}
