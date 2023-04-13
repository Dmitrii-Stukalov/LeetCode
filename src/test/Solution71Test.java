package test;

import code.Solution71;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution71Test {
    Solution71 solution = new Solution71();

    @Test
    void firstTest() {
        String path = "/home/";
        assertEquals("/home", solution.simplifyPath(path));
    }

    @Test
    void secondTest() {
        String path = "/../";
        assertEquals("/", solution.simplifyPath(path));
    }

    @Test
    void thirdTest() {
        String path = "/home//foo/";
        assertEquals("/home/foo", solution.simplifyPath(path));
    }

    @Test
    void fourthTest() {
        String path = "/a/./b/../../c/";
        assertEquals("/c", solution.simplifyPath(path));
    }

    @Test
    void fifthTest() {
        String path = "/c//.//";
        assertEquals("/c", solution.simplifyPath(path));
    }

    @Test
    void seventhTest() {
        String path = "/";
        assertEquals("/", solution.simplifyPath(path));
    }
}