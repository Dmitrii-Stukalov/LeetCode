package code;

import java.util.Objects;

public class Solution21 {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode();
		ListNode curr = dummy;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				curr.next = new ListNode(list1.val);
				list1 = list1.next;
			} else {
				curr.next = new ListNode(list2.val);
				list2 = list2.next;
			}
			curr = curr.next;
		}
		while (list1 != null && list1.val != 0) {
			curr.next = new ListNode(list1.val);
			curr = curr.next;
			list1 = list1.next;
		}
		while (list2 != null && list2.val != 0) {
			curr.next = new ListNode(list2.val);
			curr = curr.next;
			list2 = list2.next;
		}
		return dummy.next;
	}

	public static class ListNode {
		int val;
		ListNode next;

		public ListNode() {
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

		@Override
		public String toString() {
			return "ListNode{" +
					"val=" + val +
					", next=" + next +
					'}';
		}
	}
}
