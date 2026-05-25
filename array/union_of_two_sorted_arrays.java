package array;

import java.util.HashMap;

/*Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.

The union of two arrays can be defined as the common and distinct elements in the two arrays.

NOTE: Elements in the union should be in ascending order.
Solution:we can use hashmap to check the frequency and which element is repeated twice in two arrays are the union
*/
import java.util.*;
public class union_of_two_sorted_arrays {

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={5,6,2,7,8};
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int arr:arr1){
            freq.put(arr,freq.getOrDefault(arr,0)+1);
        }
        for(int arr:arr2){
            freq.put(arr,freq.getOrDefault(arr,0)+1);
        }
        for(int c:freq.keySet()){
            if(freq.get(c)==2){
                System.out.print(c);
            }
        }
    }
}
