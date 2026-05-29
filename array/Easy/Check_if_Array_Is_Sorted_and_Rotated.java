package array.Easy;
/* Problem understanding:So we have to check whether the array is sorted or not.Important point is the array is rotated only one time.
In an array there may be many decreasing values so you have to also handle the edge cases
Solution:we can traverse the array and check for any decreasing value and we can use count variable to check how many values are decreasing
we know the array is rotated only one time so if the count is > 1 the array is not rotated.also to handle edge cases like if only one value is rotated
we can compare the first and last element of the array.
 */
public class Check_if_Array_Is_Sorted_and_Rotated {
    public static void main(String[] args) {


        int[] arr = {2,1,3,4}; //here the value is rotated.
        boolean is=true;
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                count++;

            }
            if(count>1){
                is=false;
            }
        }

        if(arr[0]<arr[arr.length-1]){
            count++;
        }
        if(count>1){
            is=false;
        }


        System.out.print(is);
    }

}
