package array.Easy;

import java.util.Arrays;
/*Problem statement:we have to Left rotate the array by K times
Solution:First we reverse the entire array then we split by k then reverse first half and second this is a optimized way time complexity:o(n)
 */
public class Left_Rotate_Array_by_One { 
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;


            k = k % nums.length;
            Left_Rotate_Array_by_One obj=new Left_Rotate_Array_by_One();
            obj.lrotate(nums, 0, nums.length - 1);
            obj.lrotate(nums, 0, k - 1);
            obj.lrotate(nums, k, nums.length - 1);
            System.out.print(Arrays.toString(nums));
        }
        void lrotate ( int[] nums, int start, int end){
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

}
