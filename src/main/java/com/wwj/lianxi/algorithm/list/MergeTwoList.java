package com.wwj.lianxi.algorithm.list;

public class MergeTwoList {
     /**
      * ListNode l1 = new ListNode(-1);
      *      l1.next = new ListNode(3);
      *      l1.next.next = new ListNode(4);
      *      l1.next.next.next = new ListNode(7);
      *      l1.next.next.next.next = new ListNode(9);
      *      ListNode l2 = new ListNode(0);
      *      l2.next = new ListNode(2);
      *      l2.next.next = new ListNode(5);
      *      l2.next.next.next = new ListNode(9);
      *      l2.next.next.next.next = new ListNode(11);
      *      ListNode head = mergerTwoList(l1, l2);
      *      ListNode p = head;
      *      while (p != null) {
      *      if (p.next != null) {
      *      System.out.print(p.val + "->");
      *      }else {
      *      System.out.print(p.val);
      *      }
      *      p = p.next;
      *      }
      *      public static ListNode mergerTwoList(ListNode l1, ListNode l2){
      *      ListNode dumy = new ListNode(0);
      *      ListNode current = dumy;
      *      while (l1 != null && l2 != null) {
      *      if (l1.val < l2.val) {
      *      current.next = l1;
      *      l1 = l1.next;
      *      }else {
      *      current.next = l2;
      *      //要移动被拼接的节点的指针
      *      l2 = l2.next;
      *      }
      *      //移动指针等待下一次拼接
      *      current = current.next;
      *      }
      *      if (l1 != null) {
      *      current.next = l1;
      *      }else {
      *      current.next = l2;
      *      }
      *      return dumy.next;
      *      }
      */
     }
