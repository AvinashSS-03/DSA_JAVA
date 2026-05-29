package array;
import java.util.*;
//Problem statement:In an array two numbers join and get the target number and return index of the value
//Solution:First we minus the target with every element in the array if the firs telelemt is 2  target is 9: 9-2=7
//If this & conatins in the array then automatically we found the target falue 2+7=9
public class Two_sum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] nums={2,7,11,15};
        int target=9;
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];
            if(map.containsKey(c)){
                System.out.print(map.get(c)+ " " +i);
            }
            map.put(nums[i],i);
        }

    }
}
