package dsa.greedy.easy;

public class LemonadeChange {

    public static void main(String[] args) {
        int[] bills = {5, 5, 5, 10, 20};
        boolean ans = lemonadeChange(bills);
        System.out.println(ans);
    }

    static boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;

        for (int bill : bills) {
            if (bill == 5) fives++;
            else if (bill == 10) {
                if (fives < 1) {
                    return false;
                }
                tens++;
                fives--;
            } else {
                if (tens >= 1 && fives >= 1) {
                    tens--;
                    fives--;
                } else if (fives >= 3) {
                    fives--;
                } else {
                    return false;
                }

            }
        }
        return true;
    }
}
