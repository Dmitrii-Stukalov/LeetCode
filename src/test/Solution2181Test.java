package test;

import code.Solution2181;
import code.Solution2181.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2181Test {
	Solution2181 solution = new Solution2181();

	@Test
	void firstTest() {
		ListNode head = new ListNode(0, new ListNode(3, new ListNode(1, new ListNode(0,
				new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0))))))));
		assertEquals(new ListNode(4, new ListNode(11)), solution.mergeNodes(head));
	}

	@Test
	void secondTest() {
		ListNode head = new ListNode(0, new ListNode(1, new ListNode(0, new ListNode(3,
				new ListNode(0, new ListNode(2, new ListNode(2, new ListNode(0))))))));
		assertEquals(new ListNode(1, new ListNode(3, new ListNode(4))), solution.mergeNodes(head));
	}

}