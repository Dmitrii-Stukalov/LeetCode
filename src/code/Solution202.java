package code;

import java.util.HashSet;
import java.util.Set;

public class Solution202 {
    public boolean isHappy(int n) {
        Set<Integer> states = new HashSet<>();
        states.add(n);
        while (n != 1) {
            int tmp = 0;
            while (n > 0) {
                int digit = n % 10;
                n /= 10;
                tmp += digit * digit;
            }
            n = tmp;
            if (!states.add(n)) {
                break;
            }
        }
        return n == 1;
    }
}
