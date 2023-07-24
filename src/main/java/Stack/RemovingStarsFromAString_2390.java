package Stack;

import java.util.*;

public class RemovingStarsFromAString_2390 {
    public String removeStars(String s) {
        char[] arrString = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i=0; i < arrString.length; i++) {
            if (arrString[i] != '*') {
                stack.push(arrString[i]);
            } else {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c: stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}