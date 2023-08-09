package HashMapAndSet;

import java.util.HashMap;

public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }
        char[] sChar = s.toCharArray();
        for(char ch : sChar) {
            if (hashMap.containsKey(ch)) {
                int count = hashMap.get(ch);
                hashMap.put(ch, count + 1);
            } else {
                hashMap.put(ch, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = t.charAt(i);
            if(hashMap.containsKey(ch)) {
                int count = hashMap.get(ch);
                if (count == 1) {
                    hashMap.remove(ch);
                } else {
                    hashMap.put(ch, count -1);
                }
            }

        }
        return hashMap.isEmpty();
    }
}
