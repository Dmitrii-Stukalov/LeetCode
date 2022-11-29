package code;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int begin = 0;
        int end = 0;
        while (end < s.length()) {
            String current = s.substring(begin, end);
            char next = s.charAt(end);
            int indexOfNext = current.indexOf(next);
            if (indexOfNext != -1) {
                begin += indexOfNext + 1;
                end++;
            } else {
                end++;
                if (current.length() + 1 > max) {
                    max = current.length() + 1;
                }
            }
        }
        return max;
    }
}
