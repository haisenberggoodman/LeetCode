package Arrays_Strings;
//You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
//
//        Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
//
//        0 <= j <= nums[i] and
//        i + j < n
//Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
public class JumpGameII_45 {
    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        int currentJump = 0;
        int farthestJump = 0;

        for (int i = 0; i < n - 1; i++) {
            farthestJump = Math.max(farthestJump, i + nums[i]); //2 4
            if (i == currentJump) { // 0 == 0
                jumps++; // 1
                currentJump = farthestJump; // 2
            }
        }
        return jumps;
    }
}
