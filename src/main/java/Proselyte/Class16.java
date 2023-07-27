package Proselyte;

public class Class16 {
}

//12345678;
//123 = 6;
class Solution {
    public static Integer calculateSum(String input) {
    int value;
    int acum = 0;
        try {
            value = Integer.valueOf(input);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
for (int i = 0; i < input.length(); i++) {
    acum += value%10;
    value = value/10;
}
        return acum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "1234";
        System.out.println(solution.calculateSum(str));
    }
}

