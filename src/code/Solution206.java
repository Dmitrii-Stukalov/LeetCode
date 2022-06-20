package code;

import java.util.Objects;

public class Solution206 {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode res = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return res;
	}


	public static class ListNode {
		int val;
		ListNode next;

		public ListNode(int val) {
			this.val = val;
		}

		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		public ListNode() {

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
