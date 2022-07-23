package test;

import code.Solution86;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution86Test {
	Solution86 solution = new Solution86();

	@Test
	void firstTest() {
		Solution86.ListNode head = new Solution86.ListNode(1, new Solution86.ListNode(4, new Solution86.ListNode(3, new Solution86.ListNode(2, new Solution86.ListNode(5, new Solution86.ListNode(2))))));
		int x = 3;
		assertEquals(new Solution86.ListNode(1, new Solution86.ListNode(2, new Solution86.ListNode(2, new Solution86.ListNode(4, new Solution86.ListNode(3, new Solution86.ListNode(5)))))), solution.partition(head, x));
	}

	@Test
	void secondTest() {
		Solution86.ListNode head = new Solution86.ListNode(2, new Solution86.ListNode(1));
		int x = 2;
		assertEquals(new Solution86.ListNode(1, new Solution86.ListNode(2)), solution.partition(head, x));
	}

}