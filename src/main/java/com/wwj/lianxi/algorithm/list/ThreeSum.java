package com.wwj.lianxi.algorithm.list;

public class ThreeSum {
    /**
     * int[] nums = {-1,0,1,2,-1,-4};
     *     List<List<Integer>> result = threeSum(nums);
     *         for(List<Integer> innerlist: result){
     * //            for (int i: innerlist){
     *         System.out.print(innerlist + "  ");
     * //            }
     *         System.out.println();
     *         static List<List<Integer>> threeSum(int[] nums){
     *             //第一步排序
     *             Arrays.sort(nums);
     *             List<List<Integer>> result = new ArrayList<>();
     *             //第二步，固定外层循环
     *             for (int i = 0; i < nums.length - 2; i++){
     *                 //过滤掉和i一样的目标值，去重
     *                 if (i > 0 && nums[i] == nums[i-1]){
     *                     continue;
     *                 }
     *                 //模拟左右指针
     *                 int left = i+1;
     *                 int right = nums.length - 1;
     *                 int target = -nums[i];
     *                 //防止下标越界
     *                 while (left < right) {
     *                     int sum = nums[left] + nums[right];
     *                     if (sum == target){
     *                         result.add(Arrays.asList(nums[i], nums[left], nums[right]));
     *                         //去重
     *                         while (left < right && nums[left] == nums[left + 1]) left++;
     *                         while (left < right && nums[right] == nums[right - 1]) right--;
     *                         left++;
     *                         right--;
     *                     } else if (sum < target) {
     *                         left++;
     *                     }else {
     *                         right--;
     *                     }
     *                 }
     *             }
     *             return result;
     *         }
     */
}
