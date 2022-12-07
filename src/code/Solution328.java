package code;

import java.util.Objects;

public class Solution328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode evenHead = head.next;
        ListNode oddCurr = head;
        ListNode evenCurr = evenHead;
        while (oddCurr.next != null && evenCurr.next != null) {
            oddCurr.next = evenCurr.next;
            oddCurr = oddCurr.next;

            evenCurr.next = oddCurr.next;
            evenCurr = evenCurr.next;
        }
        oddCurr.next = evenHead;
        return head;
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

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
