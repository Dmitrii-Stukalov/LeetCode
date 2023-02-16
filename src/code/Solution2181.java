package code;

import java.util.Objects;

public class Solution2181 {
	public ListNode mergeNodes(ListNode head) {
		ListNode result = new ListNode();
		ListNode ans = result;
		head = head.next;
		int sum = 0;
		while (head != null) {
			if (head.val != 0) {
				sum += head.val;
			} else {
				result.next = new ListNode(sum);
				sum = 0;
				result = result.next;
			}
			head = head.next;
		}
		return ans.next;
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
		public int hashCode() {
			return Objects.hash(val, next);
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
