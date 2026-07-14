package com.wwj.lianxi.algorithm.list;

public class TwoSum {
    /**
     *         int[] arrs = new int[]{2,7,8,11};
     *         int[] res = TwoSum(arrs, 9);
     *         System.out.println(res[0] + "," + res[1]);
     *
     *         <---------------------题解---------------------->
     *          static int[] TwoSum(int[] arrs, int target) {
     *              Map<Integer, Integer> result = new HashMap<>();
     *              for (int i = 0; i < arrs.length; i++) {
     *              int need = target - arrs[i];
     *              if (result.containsKey(need)) {
     *                 return new int[] {result.get(need), i};
     *              }
     *              result.put(arrs[i], i);
     *              }
     *              return new int[] {};
     *           }
     *
     */
}
