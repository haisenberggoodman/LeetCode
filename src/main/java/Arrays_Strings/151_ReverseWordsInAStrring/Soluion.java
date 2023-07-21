package Arrays_Strings.ReverseWordsInAStrring_151;

class Solution {
    public String reverseWords(String s) {
        String[] strArr = s.trim().split("\\s+");
        int left = 0;
        int right = strArr.length - 1;

        while(left < right){
            String temp = strArr[left];
            strArr[left] = strArr[right];
            strArr[right] = temp;
            left++;
            right--;


        }

            return String.join(" ", strArr);
    }
}

//Input: s = "  hello world  "
//        Output: "world hello"
//        Explanation: Your reversed string should not contain leading or trailing spaces.
//        Example 3:
//
//        Input: s = "a good   example"
//        Output: "example good a"
//        Explanation: You need to reduce m ultiple spaces between two words to a single space in the reversed string.