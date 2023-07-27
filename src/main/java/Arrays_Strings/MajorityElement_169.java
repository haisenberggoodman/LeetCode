package Arrays_Strings;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        int majorityNumber = 0;
        int count = 0;

        for (int num: nums) {
            if (count == 0) {
                majorityNumber = num;
            }

            if (num == majorityNumber) {
                count++;
            } else {
                count--;
            }
        }
        return majorityNumber;
    }
}
