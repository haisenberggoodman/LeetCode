package Arrays_Strings;

public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        boolean isitaPalindrome = true;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }
            if (leftChar != rightChar) {
                isitaPalindrome = false;
                break;
            }
            left++;
            right--;

        }
        return isitaPalindrome;
    }

}
