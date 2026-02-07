package dsa.string.medium;

import java.util.Map;

public class RomanToInteger {

    static Map<Character, Integer> romanMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        int ans = romanToInt(roman);
        System.out.println(ans); // Output: 1994
    }



    //time complexity: O(n)
    //space complexity: O(1)
    private static int romanToInt(String s) {

        int total = 0;
        int prevVal = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentVal = romanMap.get(currentChar);

            if (currentVal < prevVal) {
                total -= currentVal;
            } else {
                total += currentVal;
            }

            prevVal = currentVal;
        }

        return total;
    }


}
