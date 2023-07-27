package Arrays_Strings;

public class RomanInteger_13 {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length()-1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'V') {
                result += 4; // IV
                i++;
            } else if (i < s.length()-1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'X') {
                result += 9; // IX
                i++;
            } else if (i < s.length()-1 && s.charAt(i) == 'X' && s.charAt(i+1) == 'L') {
                result += 40; // XL
                i++;
            } else if (i < s.length()-1 && s.charAt(i) == 'X' && s.charAt(i+1) == 'C') {
                result += 90; // XC
                i++;
            } else if (i < s.length()-1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'D') {
                result += 400; // CD
                i++;
            } else if (i < s.length()-1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'M') {
                result += 900; // XM
                i++;
            } else if (s.charAt(i) == 'I') {
                result += 1; // I
            } else if (s.charAt(i) == 'V') {
                result += 5; // V
            } else if (s.charAt(i) == 'X') {
                result += 10; // X
            } else if (s.charAt(i) == 'L') {
                result += 50; // L
            } else if (s.charAt(i) == 'C') {
                result += 100; // C
            } else if (s.charAt(i) == 'D') {
                result += 500; // D
            } else if (s.charAt(i) == 'M') {
                result += 1000;
            }
        }
        return result;
    }
}
