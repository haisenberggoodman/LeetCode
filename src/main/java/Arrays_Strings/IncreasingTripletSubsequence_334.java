package Arrays_Strings;

public class IncreasingTripletSubsequence_334 {
    public boolean increasingTriplet(int[] nums) {
        // min integer second min integer
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= min) {
                min = num; // min = 20
            } else if (num <= secondMin) {
                secondMin = num; // secondMin =
            } else {
                return true;
            }
        }
        return false;
    }
}
