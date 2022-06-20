package test;

import code.Solution206;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution206Test {
	Solution206 solution = new Solution206();

	@Test
	void firstTest() {
		Solution206.ListNode head = new Solution206.ListNode(1, new Solution206.ListNode(2, new Solution206.ListNode(3, new Solution206.ListNode(4, new Solution206.ListNode(5)))));
		assertEquals(new Solution206.ListNode(5, new Solution206.ListNode(4, new Solution206.ListNode(3, new Solution206.ListNode(2, new Solution206.ListNode(1))))), solution.reverseList(head));
	}

	@Test
	void secondTest() {
		Solution206.ListNode head = new Solution206.ListNode(1, new Solution206.ListNode(2));
		assertEquals(new Solution206.ListNode(2, new Solution206.ListNode(1)), solution.reverseList(head));
	}

	@Test
	void thirdTest() {
		Solution206.ListNode head = new Solution206.ListNode();
		assertEquals(new Solution206.ListNode(), solution.reverseList(head));
	}
}