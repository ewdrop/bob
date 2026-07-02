package com.wwj.lianxi.algorithm;

public class SwapPairs {
    /**
     * ListNode head = new ListNode(1);
     *           head.next = new ListNode(2);
     *           head.next.next = new ListNode(3);
     *           head.next.next.next = new ListNode(4);
     *           head.next.next.next.next = new ListNode(5);
     *           ListNode result = swapPairs(head);
     *           while (result != null) {
     *               System.out.print(result.val + "->");
     *               result = result.next;
     *           }
     *
     *           public static ListNode swapPairs(ListNode head) {
     *         ListNode dummy = new ListNode(0,head);
     *         ListNode prev = dummy;
     *         while (prev.next != null && prev.next.next != null) {
     *         //交换相邻节点指针
     *             ListNode first = prev.next;
     *             ListNode second = prev.next.next;
     *             first.next = second.next;
     *             second.next = first;
     *             prev.next = second;
     *             //将指针移到两个节点中交换后的第二个节点
     *             prev = first;
     *         }
     *         return dummy.next;
     *     }
     */
}
