package com.wwj.lianxi.algorithm.list;

public class RemoveTheNthNode {
    /**
     * 快慢指针
     * ListNode head = new ListNode(1);
     *         head.next = new ListNode(2);
     *         head.next.next = new ListNode(3);
     *         head.next.next.next = new ListNode(4);
     *         head.next.next.next.next = new ListNode(5);
     *         ListNode result = removeTheNthNode(head, 2);
     *         ListNode temp =result;
     *         while (temp != null){
     *             System.out.println(temp.val);
     *             temp = temp.next;
     *         }
     * public static ListNode removeTheNthNode(ListNode head, int n) {
     *         ListNode dummy = new ListNode(0, head);
     *         ListNode fast = dummy;
     *         ListNode slow = dummy;
     *
     *         for (int i = 0; i < n; i++) {
     *             fast = fast.next;
     *         }
     *         while (fast.next != null){
     *             fast = fast.next;
     *             slow = slow.next;
     *         }
     *         slow.next = slow.next.next;
     *         return dummy.next;
     *     }
     */
}
