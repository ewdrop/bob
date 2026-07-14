package com.wwj.lianxi.algorithm.list;

public class LengthOfLongestSubString {

    /**
     * 滑动窗口
     * String string= "abcdabcabcdeabid";
     *         System.out.println(lengthOfLongestSubString(string));
     *
     *      <---------------------题解---------------------->
     *     static int lengthOfLongestSubString(String s){
     *         int n = s.length();
     *         int maxLen = 0;//存最长子串的长度变量
     *         int left = 0;
     *         Map<Character,Integer> lastSeen = new HashMap<>();
     *         for (int right = 0; right < n; right++) {
     *         //字符取出作比较，如果已出现，移动左窗口为原位置+1
     *         确保窗口内没有重复值
     *             char c = s.charAt(right);
     *             if (lastSeen.containsKey(c)&&lastSeen.get(c) >= left){
     *                 left = lastSeen.get(c) + 1;
     *             }
     *             lastSeen.put(c,right);//用重复元素新索引覆盖旧索引
     *             maxLen = Math.max(maxLen, right - left +1);
     *         }
     *         return maxLen;
     *     }
     */
}
