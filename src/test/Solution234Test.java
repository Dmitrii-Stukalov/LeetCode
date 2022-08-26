package test;

import code.Solution234;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution234Test {
	Solution234 solution = new Solution234();

	@Test
	void firstTest() {
		Solution234.ListNode head = new Solution234.ListNode(1, new Solution234.ListNode(2, new Solution234.ListNode(2, new Solution234.ListNode(1))));
		assertTrue(solution.isPalindrome(head));
	}

	@Test
	void secondTest() {
		Solution234.ListNode head = new Solution234.ListNode(1, new Solution234.ListNode(2));
		assertFalse(solution.isPalindrome(head));
	}
}