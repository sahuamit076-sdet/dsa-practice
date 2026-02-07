package dsa.string.hard;

public class AddFromToMakePalindrome {

    public static void main(String[] args) {
        String s = "abaca"; //0,1,2,3,4
        String ans = makePalindrome(s);
        System.out.println(ans);
    }


    //brute force
    // time complexity O(n^2)
    // space complexity O(n)
    private static String makePalindrome(String s) {
        for (int i = s.length(); i >= 0; i--) {
            boolean ans = isPalindrome(s.substring(0, i));
            if (ans) {
                String suffix = s.substring(i);
                String prefix = reverse(suffix);
                return prefix + s;
            }
        }
        return s;
    }

    private static boolean isPalindrome(String s) {
        int j = s.length() - 1;
        int i = 0;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    private static String reverse(String s) {
        int j = s.length() - 1;
        int i = 0;
        char[] arr = s.toCharArray();
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return new String(arr);
    }
}
