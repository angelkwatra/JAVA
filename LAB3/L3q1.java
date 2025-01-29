import java.util.*;

class L3q1 {
    public static int[] findMinMax(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 7, 2, 9, 3};
        System.out.println(Arrays.toString(findMinMax(nums))); 
    }
}
