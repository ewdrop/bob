package com.wwj.lianxi.algorithm.stack;

public class QueenWithStacks {
    /**
     * QueenWithStacks queue = new QueenWithStacks();
     *
     *     queue.push(1);
     *     queue.push(2);
     *     queue.push(3);
     *
     *     System.out.println(queue.peek());    // 应该输出 1
     *     System.out.println(queue.pop());     // 应该输出 1
     *     System.out.println(queue.peek());    // 应该输出 2
     *     System.out.println(queue.empty());   // 应该输出 false
     *
     *     public static class QueenWithStacks {
     *         Stack<Integer> inStack = null;
     *         Stack<Integer> outStack =null;
     *
     *         public QueenWithStacks() {
     *             inStack = new Stack<>();
     *             outStack = new Stack<>();
     *         }
     *
     *         public void push(int val) {
     *             inStack.push(val);
     *         }
     *
     *         public int pop() {
     *             return pushIfEmpty(outStack, inStack).pop();
     *         }
     *
     *         public int peek() {
     *             return pushIfEmpty(outStack, inStack).peek();
     *         }
     *
     *         public boolean isEmpty() {
     *             return  outStack.isEmpty() && inStack.isEmpty();
     *         }
     *
     *         public static Stack<Integer> pushIfEmpty(Stack<Integer> outStack, Stack<Integer> inStack) {
     *             if (outStack.isEmpty()) {
     *                 while (!inStack.isEmpty()) {
     *                     outStack.push(inStack.pop());
     *                 }
     *             }
     *             return outStack;
     *         }
     *     }
     */
}
