package com.wwj.lianxi.algorithm.stack;

public class MinStack {
    /**
     * MinStack stack = new MinStack();
     *         stack.push(4);
     *         stack.push(2);
     *         stack.push(5);
     *         stack.push(1);
     *         stack.push(9);
     *         stack.push(0);
     *         stack.push(3);
     *
     *         System.out.println(stack.top());
     *         System.out.println(stack.getMin());
     * public static class MinStack{
     *         Stack<Integer> dataStack;
     *         Stack<Integer> minStack;
     *
     *         public MinStack() {
     *             dataStack = new Stack<>();
     *             minStack = new Stack<>();
     *         }
     *
     *         public void push(int val) {
     *             dataStack.push(val);
     *             if (minStack.isEmpty() || val < minStack.peek()) {
     *                 minStack.push(val);
     *             }else {
     *                 minStack.push(minStack.peek());
     *             }
     *         }
     *
     *         public void pop() {
     *             dataStack.pop();
     *             minStack.pop();
     *         }
     *
     *         public int top() {
     *             return dataStack.peek();
     *         }
     *
     *         public int getMin() {
     *             return minStack.peek();
     *         }
     *     }
     */
}
