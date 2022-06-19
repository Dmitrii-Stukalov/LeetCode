package test;

import code.Solution21;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution21Test {
	Solution21 solution = new Solution21();

	@Test
	void firstTest() {
		Solution21.ListNode list1 = new Solution21.ListNode(1, new Solution21.ListNode(2, new Solution21.ListNode(4)));
		Solution21.ListNode list2 = new Solution21.ListNode(1, new Solution21.ListNode(3, new Solution21.ListNode(4)));
		assertEquals(new Solution21.ListNode(1, new Solution21.ListNode(1, new Solution21.ListNode(2, new Solution21.ListNode(3, new Solution21.ListNode(4, new Solution21.ListNode(4)))))), solution.mergeTwoLists(list1, list2));
	}

	@Test
	void secondTest() {
		Solution21.ListNode list1 = new Solution21.ListNode();
		Solution21.ListNode list2 = new Solution21.ListNode();
		assertEquals(new Solution21.ListNode(), solution.mergeTwoLists(list1, list2));
	}

	@Test
	void thirdTest() {
		Solution21.ListNode list1 = new Solution21.ListNode();
		Solution21.ListNode list2 = new Solution21.ListNode(0);
		assertEquals(new Solution21.ListNode(0), solution.mergeTwoLists(list1, list2));
	}

	@Test
	void firstAdditionalTest() {
		Solution21.ListNode list1 = new Solution21.ListNode(-9, new Solution21.ListNode(3));
		Solution21.ListNode list2 = new Solution21.ListNode(5, new Solution21.ListNode(7));
		assertEquals(new Solution21.ListNode(-9, new Solution21.ListNode(3, new Solution21.ListNode(5, new Solution21.ListNode(7)))), solution.mergeTwoLists(list1, list2));
	}
}