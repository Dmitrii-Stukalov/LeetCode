package code;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution71 {
    public String simplifyPath(String path) {
        Deque<String> s = new ArrayDeque<>();
        StringBuilder res = new StringBuilder();
        String[] p = path.split("/");

        for (String value : p) {
            if (!s.isEmpty() && value.equals("..")) {
                s.pop();
            } else if (!value.equals("") && !value.equals(".") && !value.equals("..")) {
                s.push(value);
            }
        }


        if (s.isEmpty()) {
            return "/";
        }
        while (!s.isEmpty()) {
            res.insert(0, s.pop()).insert(0, "/");
        }

        return res.toString();
    }
}
