package array.Hard;
import java.util.*;
/*
Problem statement:Find the subarray that equals to the sum using xor operation
Solution:we can create a hashmap and store the prefix values like if we found them then there is a subarray
using xor opertion first we can take xor^arr[i] then we will get a value then with that we do xor^k this is same as the previous problem count_subaaray_with_given_sum
 */
public class subarray_with_XOR_k {
    public static void main(String[] args) {
        int[] arr={4,2,2,6,4};
        int k=6;
        HashMap<Integer,Integer> map=new HashMap<>();
        int xor=0;
        int count=0;
        map.put(xor,1);
        for(int num:arr){
            xor=xor^num;
            int t=xor^k;
            if(map.containsKey(t)){
                count+=map.get(t);
            }
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        System.out.print(count);
    }
}
