package dsa.string.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";
        System.out.println(areIsomorphic(s1, s2)); // Output: true
    }


    // Function to check if two strings are isomorphic
    // Algorithm:
    // 1. If lengths of s1 and s2 are not equal, return false
    // 2. Create a mapping of characters from s1 to s2
    // 3. For each character in s1, check if it has been mapped before
    // 4. If mapped, check if it maps to the same character in s2
    // 5. If not mapped, check if the character in s2 is already mapped
    // 6. If not, create the mapping
    // 7. If all characters are processed without conflicts, return true
    // Time Complexity: O(n)
    // Space Complexity with map: O(n)
    private static boolean areIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char l = s1.charAt(i);
            char r = s2.charAt(i);

            Character mapped = map.get(l);
            if (mapped != null) {
                if (mapped != r) return false;
            } else {
                if (map.containsValue(r)) return false;
                map.put(l, r);
            }
        }

        return true;
    }
}
