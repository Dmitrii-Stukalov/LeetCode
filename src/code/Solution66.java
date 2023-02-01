package code;

public class Solution66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > -1; i--) {
            digits[i]++;
            if (digits[i] != 10) {
                return digits;
            }
            digits[i] -= 10;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
