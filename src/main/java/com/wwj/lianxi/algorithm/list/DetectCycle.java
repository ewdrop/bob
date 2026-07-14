package com.wwj.lianxi.algorithm.list;

public class DetectCycle {
    /**
     * ListNode head = new ListNode(1);
     *         head.next = new ListNode(2);
     *         head.next.next = new ListNode(3);
     *         head.next.next.next = new ListNode(4);
     *         head.next.next.next.next = new ListNode(5);
     *         head.next.next.next.next.next = head.next.next;
     *         ListNode result = ringList(head);
     *         try {
     *             System.out.println(result.val);
     *         } catch (NullPointerException e) {
     *             System.out.println(result);
     *         }
     *      public static ListNode detectCycle(ListNode head) {
     *      环形链表两个以上节点
     *         if (head == null || head.next == null) return null;
     *         ListNode slow = head;//快慢指针都是头节点
     *         ListNode fast = head;
     *         //快指针一次两步慢指针一次一步，快慢指针相遇后
     *         while (fast != null && fast.next != null) {
     *              fast = fast.next.next;
     *              slow = slow.next;
     *             if (fast == slow) {
     *             //慢指针从头走，快指针从当前位置走，再次相遇为环
     *                 slow = head;
     *                 while (slow != fast) {
     *                     slow = slow.next;
     *                     fast = fast.next;
     *                 }
     *                 return slow;
     *             }
     *         }
     *         return null;
     *     }
     */
}
