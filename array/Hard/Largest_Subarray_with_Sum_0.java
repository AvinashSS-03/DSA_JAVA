package array.Hard;
/*
Problem statement:we need to find the maximum length of the subarray 0
Solution:we can use hashmap to keep the count of the prefix.so if the prefix in the hashmap then before that no number will come
 */
import java.util.HashMap;
import java.util.*;
public class Largest_Subarray_with_Sum_0 {
    public static void main(String[] args) {
        int[] arr={1,2,-2,-1,3,4,5,6,-3,-4,-5,-6};
        int k=0;
        int prefix=0;//prefix sum
        int maxlen=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            if (prefix==0){
                maxlen=i+1;
            }
            if(map.containsKey(prefix)){
                maxlen=Math.max(maxlen,i-map.get(prefix));
            }
            else{
                map.put(prefix,i);
            }
        }
        System.out.print(maxlen);
    }
}
