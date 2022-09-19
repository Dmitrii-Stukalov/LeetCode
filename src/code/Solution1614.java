package code;

public class Solution1614 {
    public int maxDepth(String s) {
        int max = 0;
        int current = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                current++;
            }
            if (c == ')') {
                current--;
            }
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}
