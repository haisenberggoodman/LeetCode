package Arrays_Strings;
//You are given an integer array nums. You are initially
//        positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
//        Return true if you can reach the last index, or false otherwise.
public class JumpGame_55 {
    public boolean canJump(int[] nums) {
        if (nums.length == 0) {
            return true;
        }

        int lastIndex = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= lastIndex) {
                lastIndex = i;
            }
        }

        return lastIndex == 0;
    }
}
