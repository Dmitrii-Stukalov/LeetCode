package code;

import java.util.Objects;

public class Solution86 {
	public ListNode partition(ListNode head, int x) {
		ListNode leftHead = new ListNode(0);
		ListNode currLeftHead = leftHead;
		ListNode rightHead = new ListNode(0);
		ListNode currRightHead = rightHead;
		while (head != null) {
			if (head.val < x) {
				currLeftHead.next = new ListNode(head.val);
				head = head.next;
				currLeftHead = currLeftHead.next;
			} else {
				currRightHead.next = new ListNode(head.val);
				head = head.next;
				currRightHead = currRightHead.next;
			}
		}
		currLeftHead.next = rightHead.next;
		return leftHead.next;
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

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			ListNode listNode = (ListNode) o;
			return val == listNode.val && Objects.equals(next, listNode.next);
		}

		@Override
		public String toString() {
			return "ListNode{" +
					"val=" + val +
					", next=" + next +
					'}';
		}
	}
}
