package Arrays_Strings.ReverseVovelsOfAString_345;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {


    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while(i < j) {
            while (i<j&&ch[i] != 'a' && ch[i] !='o'&& ch[i] !='e'&& ch[i] !='i'&& ch[i] !='u'
            && ch[i] != 'A' && ch[i] !='O'&& ch[i] !='E'&& ch[i] !='I'&& ch[i] !='U') {
                i++;
            }
            while (i<j&&ch[j] != 'a' && ch[j] !='o'&& ch[j] !='e'&& ch[j] !='i'&& ch[j] !='u'
                    && ch[j] != 'A' && ch[j] !='O'&& ch[j] !='E'&& ch[j] !='I'&& ch[j] !='U') {
                j--;
            }

            if (i<j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;


            }


        }
        return new String(ch);

    }
}
//    Given a string s, reverse only all the vowels in the string and return it.
//
//        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
//
//
//        Example 1:
//
//        Input: s = "hello"
//        Output: "holle"
//        Example 2:
//
//        Input: s = "leetcode"
//        Output: "leotcede"