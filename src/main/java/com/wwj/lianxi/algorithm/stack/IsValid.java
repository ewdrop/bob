package com.wwj.lianxi.algorithm.stack;

public class IsValid {
    /**
     *         String s = "({[}])";
     *         System.out.println(isValid(s));
     *         public static boolean isValid(String s) {
     *         Stack<Character> stack = new Stack<>();
     *         for (char c : s.toCharArray()) {
     *             if (c == '(' || c =='{' || c == '[') {
     *                 stack.push(c);
     *             }else {
     *                 if (stack.isEmpty()) return false;
     *                 //非左括号出栈匹配
     *                 char top = stack.pop();
     *                 if (!isMarch(top, c)) {
     *                     return false;
     *                  }
     *                }
     *              }
     *              return stack.isEmpty();
     *          }
     *
     *     private static boolean isMarch(char left, char right) {
     *         return (left == '(' && right == ')' ||
     *                 left == '{' && right == '}' ||
     *                 left == '[' && right == ']');
     *         }
     */
}
