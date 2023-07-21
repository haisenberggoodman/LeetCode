package HashMapAndSet;

import java.util.*;

public class FindTheDifferenceOfTwoArrays_2215 {
    List<Integer> getElementInTheFirstNum (int[] nums1, int[] nums2) {
        Set<Integer> OnlyInNums1 = new HashSet<>();

        for (int num : nums1) {
            boolean existInNum1 = false;
            for (int x : nums2) {
                if (x == num) {
                    existInNum1 = true;
                    break;
                }
            }
            if (!existInNum1) {
                OnlyInNums1.add(num);
            }
        }
        return new ArrayList<>(OnlyInNums1);
    }




    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getElementInTheFirstNum(nums1, nums2), getElementInTheFirstNum(nums1, nums2));
    }
}

//Input: nums1 = [1,2,3], nums2 = [2,4,6]
//        Output: [[1,3],[4,6]]