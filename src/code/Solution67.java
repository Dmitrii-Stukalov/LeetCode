package code;

public class Solution67 {
    public String addBinary(String a, String b) {
        int firstPointer = a.length() - 1;
        int secondPointer = b.length() - 1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        while (firstPointer >= 0 && secondPointer >= 0) {
            char firstDigit = a.charAt(firstPointer--);
            char secondDigit = b.charAt(secondPointer--);
            if (firstDigit == '1' && secondDigit == '1') {
                if (carry == 0) {
                    result.append(0);
                    carry = 1;
                } else {
                    result.append(1);
                }
            } else if (firstDigit == '1' && secondDigit == '0') {
                if (carry == 0) {
                    result.append(1);
                } else {
                    result.append(0);
                }
            } else if (firstDigit == '0' && secondDigit == '1') {
                if (carry == 0) {
                    result.append(1);
                } else {
                    result.append(0);
                }
            } else if (firstDigit == '0' && secondDigit == '0') {
                if (carry == 0) {
                    result.append(0);
                } else {
                    result.append(1);
                    carry = 0;
                }
            }
        }
        carry = appendResult(a, firstPointer, result, carry);
        carry = appendResult(b, secondPointer, result, carry);
        if (carry == 1) {
            result.append(1);
        }
        return result.reverse().toString();
    }

    private int appendResult(String b, int secondPointer, StringBuilder result, int carry) {
        while (secondPointer >= 0) {
            char secondDigit = b.charAt(secondPointer--);
            if (secondDigit == '0' && carry == 0) {
                result.append(0);
            } else if (secondDigit == '0') {
                result.append(1);
                carry = 0;
            } else if (secondDigit == '1' && carry == 0) {
                result.append(1);
            } else if (secondDigit == '1') {
                result.append(0);
            }
        }
        return carry;
    }
}
