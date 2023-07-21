package PrefixSum;

public class FindTheHighestAltitude_1732 {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int n = gain.length;
        int i = 0;
        int temp = 0;

        while (i < n) {
            temp += gain[i];
            maxAltitude = Math.max(maxAltitude, temp);
            i++;

        }
      return maxAltitude;
    }
}
