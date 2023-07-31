package Arrays_Strings;

public class MaximumNumberOfVowelsInASubstringOfGivenLength_1456 {
    public int maxVowels(String s, int k) {
        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (isVowel(currentChar)) {
                count++;
            }
            if (i >= k && isVowel(s.charAt(i - k))) {
                count--;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

