package Arrays_Strings;

//Given a binary array nums and an integer k, return the maximum
//        number of consecutive 1's in the array if you can flip at most k 0's.
public class MaxConsecutiveOnesIII_1004 {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int zero = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }
            while(zero > k && j < nums.length){ // [0,0,0,0,1,1], k = 2 i = 3// ; j = 2

                if(nums[j] == 0){
                    zero--;
                }
                j++;
            }
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
}
