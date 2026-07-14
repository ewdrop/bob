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
     *
     *         <---------------------题解---------------------->
     *             //快慢指针都代表节点而非值
     * public static ListNode removeTheNthNode(ListNode head, int n) {
     *         ListNode dummy = new ListNode(0, head);
     *         ListNode fast = dummy;//快指针，先走N步
     *         ListNode slow = dummy;//慢指针
     *
     *         for (int i = 0; i < n; i++) {
     *             fast = fast.next;
     *         }
     *         //条件为快指针有后继节点则说明链表没走到头
     *         while (fast.next != null){
     *             fast = fast.next;
     *             slow = slow.next;
     *         }
     *         slow.next = slow.next.next;
     *         return dummy.next;
     *     }
     */
}
