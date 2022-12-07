package test;

import code.Solution328;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution328Test {
    Solution328 solution = new Solution328();

    @Test
    void firstTest() {
        Solution328.ListNode head = new Solution328.ListNode(1, new Solution328.ListNode(2,
                new Solution328.ListNode(3, new Solution328.ListNode(4, new Solution328.ListNode(5)))));
        assertEquals(new Solution328.ListNode(1, new Solution328.ListNode(3,
                new Solution328.ListNode(5, new Solution328.ListNode(2, new Solution328.ListNode(4))))), solution.oddEvenList(head));
    }

    @Test
    void secondTest() {
        Solution328.ListNode head = new Solution328.ListNode(2, new Solution328.ListNode(1,
                new Solution328.ListNode(3, new Solution328.ListNode(5, new Solution328.ListNode(6,
                        new Solution328.ListNode(4, new Solution328.ListNode(7)))))));
        assertEquals(new Solution328.ListNode(2, new Solution328.ListNode(3, new Solution328.ListNode(6,
                new Solution328.ListNode(7, new Solution328.ListNode(1, new Solution328.ListNode(5,
                        new Solution328.ListNode(4))))))), solution.oddEvenList(head));
    }

}