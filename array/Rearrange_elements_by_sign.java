package array;

import java.util.Arrays;

public class Rearrange_elements_by_sign {
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        int[] arr=new int[nums.length];
        int positive=0;
        int negative=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[positive]=nums[i];
                positive+=2;
            }
            else {
                arr[negative]=nums[i];
                negative+=2;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
