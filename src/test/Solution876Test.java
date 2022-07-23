package test;

import code.Solution876;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution876Test {
	Solution876 solution = new Solution876();

	@Test
	void firstTest() {
		Solution876.ListNode head = new Solution876.ListNode(1, new Solution876.ListNode(2, new Solution876.ListNode(3, new Solution876.ListNode(4, new Solution876.ListNode(5)))));
		assertEquals(new Solution876.ListNode(3, new Solution876.ListNode(4, new Solution876.ListNode(5))), solution.middleNode(head));
	}

	@Test
	void secondTest() {
		Solution876.ListNode head = new Solution876.ListNode(1, new Solution876.ListNode(2, new Solution876.ListNode(3, new Solution876.ListNode(4, new Solution876.ListNode(5, new Solution876.ListNode(6))))));
		assertEquals(new Solution876.ListNode(4, new Solution876.ListNode(5, new Solution876.ListNode(6))), solution.middleNode(head));
	}

}