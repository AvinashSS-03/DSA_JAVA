package array.Easy;

import java.util.Arrays;

/*
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Solution1:If the question is to return number of duplicates we can travese the array and check if the current element is not equal to next element.so we know how many unique are there;
Solution2:If the problem is to remove the element and provide only unique elements since the array is sorted it is easy to solve;
Solution3:If the problem is to remove the element and the array is not sorted we can use boolen element to keep a track on duplicates elements
 */
public class Remove_duplicates_from_Sorted_array {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,2};
        Remove_duplicates_from_Sorted_array obj=new Remove_duplicates_from_Sorted_array();
        obj.solution3(nums);

    }
    void solution1(int[] arr){
        int count=1; //in every array the first element is unique that is why count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                arr[count++]=arr[i];
            }
        }
        System.out.print(count);
    }
    void solution2(int[] arr){
        int count=0;
        arr[count++]=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                arr[count++]=arr[i];
            }
        }
        for(int i=0;i<count;i++){
            System.out.println(arr[i]); //It only shows the Unique values in an sorted array
        }
        System.out.print(Arrays.toString(arr));//This is to say that we are not creating a new array we are just modifying the exisiting array
    }
    void solution3(int[]arr){
        boolean[] ar= new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(ar[arr[i]]){
                System.out.println(arr[i]); //this print dupicates values in the element;

            }
            else {
                ar[arr[i]]=true;
            }
        }
    }
}
