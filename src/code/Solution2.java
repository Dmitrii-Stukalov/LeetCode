package code;

import java.util.Objects;

public class Solution2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int overload = 0;
		int firstNumber = 0;
		int secondNumber = 0;
		if (l1 != null && l1.next != null) {
			firstNumber = l1.val;
		}
		if (l2 != null && l2.next != null) {
			secondNumber = l2.val;
		}
		int sum = firstNumber + secondNumber + overload;
		int currentValue = 0;
		if (sum > 9) {
			currentValue = sum % 10;
			l1.next.val += sum / 10;
		} else {
			currentValue = sum;
		}
		if (l1 == null && l2 == null) {
			return new ListNode(currentValue);
		}
		if (l1 == null) {
			return new ListNode(currentValue, addTwoNumbers(new ListNode(0), l2.next));
		}
		if (l2 == null) {
			return new ListNode(currentValue, addTwoNumbers(new ListNode(0), l1.next));
		}
		return new ListNode(currentValue, addTwoNumbers(l1.next, l2.next));
	}


	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		public ListNode(int val) {
			this.val = val;
		}

		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			ListNode listNode = (ListNode) o;
			return val == listNode.val && Objects.equals(next, listNode.next);
		}
	}
}
