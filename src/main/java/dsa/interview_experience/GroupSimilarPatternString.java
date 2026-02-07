package dsa.interview_experience;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupSimilarPatternString {

    public static void main(String[] args) {
        String[] input = {"AABC", "AAAA", "NNNN", "CCDX", "CCXX", "AABB", "CCCC", "ABCD", ""};
        String[] output = makeUnique(input);
        System.out.println(Arrays.toString(output));
    }

    static String[] makeUnique(String[] input) {
        String[] output = new String[input.length];

        Map<String, Integer> integerMap = new HashMap<>();
        integerMap.put(input[0], 1);
        output[0] = input[0];
        for (int i = 1; i < input.length; i++) {
            int count = integerMap.getOrDefault(input[i], -1);
            if (count != -1) {
                String val = input[i] + "(" + count + ")";
                while (integerMap.containsKey(val)) {
                    count++;
                    val = input[i] + "(" + count + ")";
                }
                output[i] = val;
                integerMap.put(val, 1);
            } else {
                output[i] = input[i];
                integerMap.put(input[i], 1);
            }
        }

        return output;
    }
}
