package com.wwj.lianxi.algorithm;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubString {

    /**String string= "abcdabcabcdeabid";
        System.out.println(lengthOfLongestSubString(string));

    static int lengthOfLongestSubString(String s){
        int n = s.length();
        int maxLen = 0;
        int left = 0;
        Map<Character,Integer> lastSeen = new HashMap<>();
        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            if (lastSeen.containsKey(c)&&lastSeen.get(c) >= left){
                left = lastSeen.get(c) + 1;
            }
            lastSeen.put(c,right);
            maxLen = Math.max(maxLen, right - left +1);
        }
        return maxLen;
    }*/
}
