package Arrays_Strings;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOf_K_SumPairs_1679 {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int numberOfOperations = 0;

        for (int num : nums) {
            int complement = k - num;
            if (frequencyMap.containsKey(complement) && frequencyMap.get(complement) > 0) {
                frequencyMap.put(complement, frequencyMap.get(complement)-1);
                numberOfOperations++;
            } else {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }
        return numberOfOperations;
    }
}