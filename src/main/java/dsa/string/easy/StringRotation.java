package dsa.string.easy;

public class StringRotation {

    public static void main(String[] args) {
        String str1 = "water";
        String str2 = "erwat";
        boolean ans = isRotation(str1, str2);
        System.out.println(ans);
    }

    private static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}
