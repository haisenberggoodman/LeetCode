package MergeStringAlternately_1;

class Solution {
    public String mergeAlternately(String word1, String word2) {
       char[] w1 = word1.toCharArray();
       char[] w2 = word2.toCharArray();
       int len1 = w1.length;
       int len2 = w2.length;
       int maxlength = Math.max(len1, len2);

       StringBuilder stringBuilder = new StringBuilder();

       for (int i = 0; i < maxlength; i++) {
           if (i < len1) {
               stringBuilder.append(w1[i]);
           }
           if (i < len2) {
               stringBuilder.append(w2[i]);
           }

       }
        return stringBuilder.toString();
    }
}
