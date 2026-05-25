package array;
import java.util.*;
/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.*/
public class single_number {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,3,4,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int c:map.keySet()){
            if(map.get(c)==1){
                 System.out.print(c);
                 break;
            }
        }

    }
}
