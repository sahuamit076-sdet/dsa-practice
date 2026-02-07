package dsa.greedy.easy;

public class JumpGame {

    public static void main(String[] args) {
        int[] nums = {2, 0, 1, 1, 4};
        System.out.println(canJump(nums)); // Output: true
    }

    static boolean canJump(int[] nums) {

        int maxIndex = 0;
        while( maxIndex < nums.length) {
            int sum = maxIndex + nums[maxIndex];
            if(sum  == maxIndex) {
                return false;
            } else  {
                maxIndex = sum;
            }
        }
        return true;
    }



}
