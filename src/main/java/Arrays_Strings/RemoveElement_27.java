package Arrays_Strings;

public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

//Input: nums = [3,2,2,3], val = 3
//        Output: 2, nums = [2,2,_,_]