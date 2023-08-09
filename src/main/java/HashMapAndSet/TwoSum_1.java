package HashMapAndSet;
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.

import java.util.HashMap;

public class TwoSum_1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(hashMap.containsKey(complement)) {
                return new int[] {hashMap.get(complement), i};
            }  else {
                hashMap.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
