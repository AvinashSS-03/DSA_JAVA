package array;

import java.util.Arrays;

public class move_zeros_to_end {
    public static void main(String[] args) {
        int[] nums={1,2,0,0,0,4,5,0,9,7,0,4,6};
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[c++] = nums[i];
            }

        }
        for (int i = c; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.print(Arrays.toString(nums));
    }
}
