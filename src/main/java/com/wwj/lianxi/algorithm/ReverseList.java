package com.wwj.lianxi.algorithm;

public class ReverseList {

    /**ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    ListNode newHead = reverseList(head);
    ListNode p = newHead;
        while (p != null) {
        System.out.print(p.val + "->");
        p = p.next;
    }
        System.out.println("null");

    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            //先保存头节点的后继，避免链表丢失
            ListNode next = curr.next;
            //头节点指向空
            curr.next = prev;
            //指向头节点
            prev = curr;
            //当前节点指向原头指针的后继
            curr = next;
        }
        return prev;
    }*/

}
