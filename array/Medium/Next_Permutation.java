package array.Medium;
/*
Problem statement:We have to find the next permutation.We should not create  new array only we have to modify in the exisiting array
Solution:First we need to understand what is permutation.Permutation means forming arrays with different elements Note:exisiting element only
Ex:[3,2,4,1] we can form this [1,2,3,4],[1,3,2,4],[1,3,4,2],[1,4,2,3],going on... then [3,2,4,1] next should be greater but not too greater which is closet we have to return
Approach:*Find breaking point where arr[i]<arr[i+1]
         *Check whether breaking point exist if not just reverse the array it means they are in ascending order
         *After finding breaking point check for the largest element than index and swap;
         *reverse the element after index.

 */
import java.lang.reflect.Array;
import java.util.Arrays;

public class Next_Permutation {
    public static void main(String[] args) {
        Next_Permutation obj=new Next_Permutation();
        int[] nums = {2, 1, 5, 4, 3, 0, 0};
        int index = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            obj.reverse(nums, 0, nums.length - 1);
            return;
        }
        for (int i = nums.length - 1; i >= index; i--) {
            if (nums[i] > nums[index]) {
                obj.swap(nums, i, index);
                break;
            }
        }
        obj.reverse(nums, index + 1, nums.length - 1);
        System.out.print(Arrays.toString(nums));


    }

    void swap(int[] nums, int s, int e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }

    void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}