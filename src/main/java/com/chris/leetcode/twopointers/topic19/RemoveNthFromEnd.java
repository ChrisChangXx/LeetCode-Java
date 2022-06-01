package com.chris.leetcode.twopointers.topic19;

/**
 * @创建人 zhanghui
 * @创建时间 2022/5/10
 * @描述 删除链表的倒数第N个节点
 */
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        int n = 2;
        System.out.println(removeNthFromEnd(listNode, n));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode fast = head, slow = head, preSlow = dummyHead;
        while (fast != null) {
            if (n <= 0) {
                preSlow = slow;
                slow = slow.next;
            }
            n--;
            fast = fast.next;
        }
        preSlow.next = slow.next;
        return dummyHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return val + " " + (next == null ? "" : next.toString());
        }
    }
}
