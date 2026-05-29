package array.Medium;

import java.util.ArrayList;

/*
Problem statement:In a array you have to fina a leader a leader is a element ehich is greter to its right of all the elements
Solution:
We know a leader is one which is greater thn to its right element so w ecan trace back from the last element and we can keep the
last element as max because after last element there is no number so last element automatically becomes a leader.
 */
public class Leaders_Array {
    public static void main(String[] args) {
        int[] arr={11,22,3,4,16,7,9,10};
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                list.add(arr[i]);
            }
        }
      System.out.print(list);
    }
}
