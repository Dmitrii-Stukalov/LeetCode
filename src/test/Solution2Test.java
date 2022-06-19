package test;

import code.Solution2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2Test {
	Solution2 solution = new Solution2();

	@Test
	void firstTest() {
		Solution2.ListNode list1 = new Solution2.ListNode(2, new Solution2.ListNode(4, new Solution2.ListNode(3)));
		Solution2.ListNode list2 = new Solution2.ListNode(5, new Solution2.ListNode(6, new Solution2.ListNode(4)));
		assertEquals(new Solution2.ListNode(7, new Solution2.ListNode(0, new Solution2.ListNode(8))), solution.addTwoNumbers(list1, list2));
	}

	@Test
	void secondTest() {
		Solution2.ListNode list1 = new Solution2.ListNode(0);
		Solution2.ListNode list2 = new Solution2.ListNode(0);
		assertEquals(new Solution2.ListNode(0), solution.addTwoNumbers(list1, list2));
	}

	@Test
	void thirdTest() {
		Solution2.ListNode list1 = new Solution2.ListNode(9, new Solution2.ListNode(9, new Solution2.ListNode(9, new Solution2.ListNode(9, new Solution2.ListNode(9, new Solution2.ListNode(9, new Solution2.ListNode(9)))))));
		Solution2.ListNode list2 = new Solution2.ListNode(9, new Solution2.ListNode(9, new Solution2.ListNode(9, new Solution2.ListNode(9))));

		assertEquals(new Solution2.ListNode(8, new Solution2.ListNode(9, new Solution2.ListNode(9, new Solution2.ListNode(9, new Solution2.ListNode(0, new Solution2.ListNode(0, new Solution2.ListNode(0, new Solution2.ListNode(1)))))))), solution.addTwoNumbers(list1, list2));

	}

}