package Two_Pointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Move_Zeroes_283 {
    public void moveZeroes(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
                //1 3 12
            }
        }

        int nonZeroCount = list.size(); // 3
        for (int i = 0; i < nums.length; i++) {
            if (i < nonZeroCount) {
                nums[i] = list.poll();
            } else {
                nums[i] = 0;
            }
        }
    }
}


//Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//        Example 2:
//
//        Input: nums = [0]
//        Output: [0]