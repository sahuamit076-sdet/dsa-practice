package dsa.interview_experience.medium;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupSimilarPatternString {

    public static void main(String[] args) {
        String[] input = {"AABC", "AAAA", "NNNN", "CCDX", "CCXX", "AABB", "CCCC", "ABCD"};
        groupPattern(input);
    }

    static void groupPattern(String[] input) {

        Map<String, List<String>> groups = new HashMap<>();

        for (String s : input) {
            Map<Character, Integer> pointers = new HashMap<>();
            int pointer = 0;
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                int value = pointers.getOrDefault(s.charAt(j), -1);
                if (value != -1) {
                    temp.append(value);
                } else {
                    pointers.put(s.charAt(j), ++pointer);
                    temp.append(pointer);
                }
            }
            groups.computeIfAbsent(temp.toString(), k -> new ArrayList<>()).add(s);
        }

        System.out.println(groups);
    }
}
