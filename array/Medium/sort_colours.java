package array;

import java.util.Arrays;
/*
Problem statement:We have to sort
Soution:we can use dutch algorithm
Dutch algothim
     -->keep the middlement in the same position do not move middle element
     -->if the case is 0 swap in first element
     -->if the case is 2 swap in last element
 */
public class sort_colours {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,0,0};
        int end=nums.length-1;
        int start=0;
        int mid=0;
        while(mid<=end){
            switch(nums[mid]){
                case 0:
                    swap(nums,start,mid);
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums,mid,end);
                    end--;
                    break;
            }
        }
        System.out.print(Arrays.toString(nums));

    }
    static void swap(int[]nums,int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    }

