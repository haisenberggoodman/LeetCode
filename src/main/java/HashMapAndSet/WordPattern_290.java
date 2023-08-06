package HashMapAndSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Given a pattern and a string s, find if s follows the same pattern.
//
//        Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
public class WordPattern_290 {
    public boolean wordPattern(String pattern, String s) {
        String[] strPool = s.split(" ");

        if (pattern.length() != strPool.length) {
            return false;
        }

        Map<Character, String> patternMap = new HashMap<>();
        Set<String> usedWords = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = strPool[i];

            if (patternMap.containsKey(c)) {
                if (!patternMap.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (usedWords.contains(word)) {
                    return false;
                }

                patternMap.put(c, word);
                usedWords.add(word);
            }
        }

        return true;
    }
}
