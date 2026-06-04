package array.Hard;

import java.util.Arrays;
/*
Problem statement:You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
Solution:they are telling us to modify the array instead of creating a new one so the arrray one has the size of m+n so we can add n here which makes our work easy
 */
public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;
        int j=m;//to add nums2 elemenet we should start from the end of nums1
        for(int i=0;i<n;i++){
            nums1[j++]=nums2[i];
        }
        Arrays.sort(nums1);
        System.out.print(Arrays.toString(nums1));
    }
}
