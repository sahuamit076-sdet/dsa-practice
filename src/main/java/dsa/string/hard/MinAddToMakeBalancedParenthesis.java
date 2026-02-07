package dsa.string.hard;

public class MinAddToMakeBalancedParenthesis {

    public static void main(String[] args) {
        String s = "())))(";
        System.out.println(minAdd(s));

    }

    private static int minAdd(String s) {

        int closeWihtoutOpen = 0;
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                size++;
            } else if (size > 0) {
                size--;
            } else {
                closeWihtoutOpen++;
            }
        }

        return Math.abs(closeWihtoutOpen + size);
    }
}
